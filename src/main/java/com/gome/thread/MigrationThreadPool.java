package com.gome.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import javax.annotation.PreDestroy;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

/**
 * <dt>自定义线程池管理请求</dt>
 * 
 * @author yyzhang
 * @since 2018年5月11日11:40:04
 */
@Configuration
@Order(1)
public class MigrationThreadPool implements ApplicationRunner{
	private Logger logger = Logger.getLogger(MigrationThreadPool.class);
	
	@Value("${pic.task.pool.corePoolSize}")
	private int corePoolSize;
	@Value("${pic.task.pool.maxPoolSize}")
	private int maxPoolSize;
	@Value("${pic.task.pool.aliveTime}")
	private int aliveTime;
	@Value("${pic.task.pool.queueSize}")
	private int queueSize;
	@Value("${pic.task.pool.isCustom}")
	private String isCustom;
	
	private ExecutorService executorService;
	
	// 根据配置初始化线程池
	@Override
	public void run(ApplicationArguments arguments) throws Exception {
		if("Y".equals(isCustom)) {
			BlockingQueue<Runnable> queue = null;
			if(queueSize < 1) {
				queue = new LinkedBlockingDeque<Runnable>(1000);
			}else {
				queue = new LinkedBlockingDeque<Runnable>(queueSize);
			}
			if(corePoolSize < 1) {
				corePoolSize = processors.get();
			}
			if(maxPoolSize < 1) {
				maxPoolSize = corePoolSize;
			}
			if(aliveTime < 1) {
				aliveTime = 60;
			}
			this.executorService = new ThreadPoolExecutor(corePoolSize, maxPoolSize, aliveTime, TimeUnit.SECONDS, queue, new ThreadPoolExecutor.AbortPolicy());
		} else {
			this.executorService = Executors.newFixedThreadPool(processors.get());
		}
		
		this.logger.info("【影像迁移】线程池启动完成, 参数: isCustom = " + isCustom);
	}
	
	/**
	 * 创建线程，对线程处理事件
	 */
	public void execute(Runnable runnable){
		executorService.execute(runnable);
	}
	
	/**
	 * 对象销毁时，销毁线程
	 */
	@PreDestroy
	public void stop() {
		executorService.shutdown(); 
	}
	
	// 利用服务cpu最大线程数，初始化线程池默认使用线程个数（本次为保证效率，暂定为1/2最大线程数）
	ThreadLocal<Integer> processors = new ThreadLocal<Integer>() {
		@Override
		protected Integer initialValue() {
			int processors = Runtime.getRuntime().availableProcessors() >> 1;
			if(processors < 1) {
				processors = 1;
			}
			return processors;
		}
	};

	public ExecutorService getExecutorService() {
		return executorService;
	}
}
