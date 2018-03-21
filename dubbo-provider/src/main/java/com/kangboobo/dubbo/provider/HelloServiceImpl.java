package com.kangboobo.dubbo.provider;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.kangboobo.dubooDemo.api.HelloService;


/**
 * 服务提供者：实现服务逻辑
 * @author kangboobo
 *
 */
public class HelloServiceImpl implements HelloService {
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloServiceImpl.class);

	@Override
	public String sayHello(String name) {
		System.out.println("服务开始执行！");
		return "Hello "+name+"!!!";
	}

}
