package com.gome.util;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

/**
 * <dt>公用工具类</dt>
 * @author yyzhang
 * @since 2018年2月2日18:28:02
 */
public class GomeCommonUtil {
	
	private static final int COMPOSE_NUM = 4;

	/**
	 * 参数空值校验
	 * 
	 * @param name
	 * @param value
	 */
	public static void checkValue(String name, String value) {
		if (StringUtils.isEmpty(value)) {
			throw new IllegalArgumentException("参数 【" + name + "】 不能为空！");
		}
	}

	/**
	 * 对象空值校验
	 * 
	 * @param obj
	 */
	public static void checkObject(Object obj) {
		if (obj == null) {
			throw new IllegalArgumentException("参数不能为空！");
		}
	}

	/**
	 * 检验是否包含中文字符
	 * 
	 * @param c
	 * @return
	 */
	public static final boolean isChinese(char[] c) {
		boolean flag = false;
		for (char d : c) {
			Character.UnicodeBlock ub = Character.UnicodeBlock.of(d);
			if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS
					|| ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
					|| ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A
					|| ub == Character.UnicodeBlock.GENERAL_PUNCTUATION
					|| ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION
					|| ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	/**
	 * 将File转为字节
	 * 
	 * @param file
	 * @return
	 */
	public static byte[] toFileByte(InputStream in) {
		byte[] buffer = null;
		ByteArrayOutputStream bos = null;
		try {
			bos = new ByteArrayOutputStream();
			byte[] b = new byte[1024];
			int n;
			while ((n = in.read(b)) != -1) {
				bos.write(b, 0, n);
			}
			buffer = bos.toByteArray();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(in != null) {
					in.close();
				}
				if(bos != null) {
					bos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return buffer;
	}
	
	/**
	 * 根据配置线程数,分解集合
	 * @param o
	 * @return
	 */
	public static List<List<?>> composeCollection(Object o) {
		List<List<?>> composes = new ArrayList<List<?>>();
		int onset = 0, offset = 0;
		if(o instanceof ArrayList) {
			List<?> list = (ArrayList<?>) o;
			if(list != null && list.size() > 0) {
				int interval = list.size() / COMPOSE_NUM;
				for(int i = 0; i < COMPOSE_NUM; i++) {
					offset = onset += interval;
					if(i == COMPOSE_NUM - 1) {
						offset = list.size();
					}
					composes.add(i, list.subList(onset - interval, offset));
				}
			}
		}
		return composes;
	}
}
