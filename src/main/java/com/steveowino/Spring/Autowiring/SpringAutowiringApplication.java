package com.steveowino.Spring.Autowiring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ComponentScan
public class SpringAutowiringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAutowiringApplication.class, args);

		//IOC container
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Human human = context.getBean("human", Human.class);
		human.startPumping();

	}

}
