package org.imenzli.spring.di.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.imenzli.spring.di.consumer.MyXMLApplication;

public class ClientXMLApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		MyXMLApplication app = context.getBean(MyXMLApplication.class);

		app.processMessage("Hi Menzlitsh", "kmenzli@abc.com");

		// close the context
		context.close();
	}

}
