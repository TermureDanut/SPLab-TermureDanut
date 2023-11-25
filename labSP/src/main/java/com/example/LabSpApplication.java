package com.example;

import com.example.services.ClientComponent;
import com.example.services.SingletonComponent;
import com.example.services.TransientComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LabSpApplication {
	public static void main(String[] args) {
		ApplicationContext context = (ApplicationContext) SpringApplication.run(LabSpApplication.class, args);
		TransientComponent transientBean = context.getBean(TransientComponent.class);
		transientBean.operation();

		transientBean = context.getBean(TransientComponent.class);
		transientBean.operation();

		SingletonComponent singletonBean = context.getBean(SingletonComponent.class);
		singletonBean.operation();

		singletonBean = context.getBean(SingletonComponent.class);
		singletonBean.operation();

		ClientComponent c = context.getBean(ClientComponent.class);
		c.operation();

		c = (ClientComponent)context.getBean("clientComponent");
		c.operation();

	}
}
