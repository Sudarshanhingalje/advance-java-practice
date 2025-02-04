package com.demo.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.demo.beans.Customer;
import com.demo.beans.Product;

public class TestProduct {

	public static void main(String[] args) {
		//BeanFactory bf=new XmlBeanFactory(new ClassPathResource("springconfig.xml"));
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		System.out.println("After beanfactory creation");
		Product p11=(Product)ctx.getBean("p1");
		Product p12=(Product)ctx.getBean("p2");
		Customer c11=(Customer)ctx.getBean("c1");
		Customer c12=(Customer)ctx.getBean("c2");
		System.out.println(p11);
		System.out.println(p12);
		System.out.println(c11);
		System.out.println(c12);
		((ClassPathXmlApplicationContext)ctx).close();
	}

}
