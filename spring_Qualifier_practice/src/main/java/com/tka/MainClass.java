package com.tka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.tka.ConfigClass;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
		Student s = context.getBean(Student.class);
		System.out.println(s.getHs1().stream());
		System.out.println(s.getHs2().stream());
		
	}

}
