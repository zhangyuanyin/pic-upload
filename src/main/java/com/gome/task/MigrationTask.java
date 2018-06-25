package com.gome.task;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.gome.domain.Picture;
import com.gome.service.PictureService;
import com.gome.thread.MigrationConcurrencyCommit;
import com.gome.thread.MigrationThreadPool;
import com.gome.util.GomeCommonUtil;

/**
 * 数据迁移定时任务
 * @author yyzhang
 * @since 2018年5月10日15:21:24
 */
@Component
public class MigrationTask implements BeanFactoryAware{
	private Logger logger = Logger.getLogger(MigrationTask.class);
	
	@Autowired
	private PictureService pictureService;
	@Autowired
	private MigrationThreadPool migrationThreadPool;
	private MigrationConcurrencyCommit migrationCommit;
	private BeanFactory beanFactory;
	private static volatile boolean flag = false;
	
	@SuppressWarnings("unchecked")
	@Scheduled(cron = "0 0 22,4 * * ?")
	public void execute() {
		this.logger.info("【影像迁移】开始...");
		if(flag) {
			this.logger.info("【影像迁移】数据已迁移完成...");
			return;
		}
		
		List<Picture> pictureList = pictureService.findPictures();
		if(pictureList != null && pictureList.size() > 0) {
			List<List<?>> composes = GomeCommonUtil.composeCollection(pictureList);
			for (List<?> compose : composes) {
				this.getBean();
				migrationCommit.setPictures((List<Picture>) compose);
				migrationThreadPool.execute(migrationCommit);
			}
		} else {
			flag = true;
		}
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}
	
	private void getBean() {
		this.migrationCommit = (MigrationConcurrencyCommit) beanFactory.getBean("migrationConcurrencyCommit");
	}
}
