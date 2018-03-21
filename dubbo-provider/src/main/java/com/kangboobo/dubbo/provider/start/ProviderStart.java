package com.kangboobo.dubbo.provider.start;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;

/**
 * 启动服务提供者
 * @author kangboobo
 *
 */
public class ProviderStart {
	private static final Logger LOGGER = LoggerFactory.getLogger(ProviderStart.class);

	public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-provider.xml");
        System.out.println(context.getDisplayName() + ": here");
        context.start();
        System.out.println("服务已经启动...");
        System.out.println("按任意键退出服务...");
        System.in.read();
    }
}
