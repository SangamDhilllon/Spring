package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycle {

	public static void main(String[] args) {
		//load config file
				ClassPathXmlApplicationContext context=
						new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
				
				//retrieve bean from spring container
				Coach coach=context.getBean("myCoach",Coach.class);

				
				//call methods on bean
				System.out.println(coach.getDailyFortune());
				
				//close context
				context.close();

	}

}
