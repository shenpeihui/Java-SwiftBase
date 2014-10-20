package com.swift.base.spring.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 应用上下文容器
 * @author shenpeihui
 *
 */
public class ApplicationContextContaniner {
	
	/**
	 * 应用上下文配置容器
	 */
	private ApplicationContext context;

	/**
	 * 应用上下文容器
	 * @param contextFiles	上下文配置文件
	 */
	public ApplicationContextContaniner(String configFiles) {
		super();
		this.context = new ClassPathXmlApplicationContext(configFiles);
	}

	/**
	 * 读取应用上下文配置容器
	 * @return the context
	 */
	public ApplicationContext getContext() {
		return context;
	}
	
}
