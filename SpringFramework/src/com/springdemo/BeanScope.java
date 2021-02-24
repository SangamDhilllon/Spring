package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScope {

	public static void main(String[] args) {
		//load config file
				ClassPathXmlApplicationContext context=
						new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
				
				//retrieve bean from spring container
				Coach coach=context.getBean("myCoach",Coach.class);
				Coach alphaCoach=context.getBean("myCoach",Coach.class);

				
				//call methods on bean
				System.out.println(coach==alphaCoach);
				
				
				//close context
				context.close();

	}

}
