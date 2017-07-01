package org.imenzli.spring.di.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.imenzli.spring.di.configuration.DIConfiguration;
import org.imenzli.spring.di.consumer.MyApplication;

public class ClientApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
		MyApplication app = context.getBean(MyApplication.class);
		
		app.processMessage("Hi Menzlitsh", "kmenzli@abc.com");
		
		//close the context
		context.close();
	}

}
