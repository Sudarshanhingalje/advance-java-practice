package com.demo.beans;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Team implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean,DisposableBean{
	private int tid;
	private String tname;
	private List<Player> plist;
	public Team() {
		super();
	}
	public Team(int tid, String tname, List<Player> plist) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.plist = plist;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public List<Player> getPlist() {
		return plist;
	}
	public void setPlist(List<Player> plist) {
		this.plist = plist;
	}
	@Override
	public String toString() {
		return "Team [tid=" + tid + ", tname=" + tname + ", plist=" + plist + "]";
	}
	public void setBeanName(String name) {
		System.out.println("in setbeanname of BeanNameAware-->"+name);
		
	}
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("in setBeanFactory of BeanFactoryAware");
		
	}
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("in setApplicationContext of ApllocationContextaware");
		
	}
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("in afterPropertiesSet of InitializingBean");
	}
	
	public void myInitMethod() {
		System.out.println("in custom init method");
	}
	public void destroy() throws Exception {
		System.out.println("in destroy of DisposableBean");
		
	}
	public void myDestroyMethod() {
		System.out.println("in custom destroy method");
	}
	
	
	
	

}
