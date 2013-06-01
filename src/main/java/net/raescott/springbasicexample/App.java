package net.raescott.springbasicexample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				new String[]{"applicationContext.xml"});
		BeanFactory bf = ctx;

		ExampleBean eb = (ExampleBean) bf.getBean("myBean");

		System.out.println("First Name: " + eb.getFirstName());
		System.out.println("Last Name: " + eb.getLastName());
	}
}
