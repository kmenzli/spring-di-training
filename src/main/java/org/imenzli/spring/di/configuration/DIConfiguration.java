package org.imenzli.spring.di.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.imenzli.spring.di.services.EmailService;
import org.imenzli.spring.di.services.MessageService;

@Configuration
@ComponentScan(value={"org.imenzli.spring.di.consumer"})
public class DIConfiguration {

	@Bean
	public MessageService getMessageService(){
		return new EmailService();
	}
}
