package com.demo.beans;

public class Product {
	private int pid;
	private String pname;
	private int qty;
	private double price;
	
	public Product()
	{
		System.out.println("in default constor");
	}
	public Product(int pid, String pname, int qty, double price)
	{
		
		System.out.println("in parametrised constor");
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
	}
	public int getPid() 
	{
		return pid;
	}
	public void setPid(int pid) 
	{
		System.out.println("in setpid");
		this.pid = pid;
	}
	public String getPname()
	{
		return pname;
	}
	public void setPname(String pname) 
	{
		System.out.println("in set product name");
		this.pname = pname;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		System.out.println("in set qty");
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		System.out.println("in set price");
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", qty=" + qty + ", price=" + price + "]";
	}
	

}
