package com.demo.beans;

public class Customer {
   private int cid;
   private String cname;
   private String mob;
public Customer() {
	super();
	System.out.println("in default constructor");
}
public Customer(int cid, String cname, String mob) {
	super();
	System.out.println("in parametrised constructor");
	this.cid = cid;
	this.cname = cname;
	this.mob = mob;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	System.out.println("in setcid");
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	System.out.println("in setcname");
	this.cname = cname;
}
public String getMob() {
	return mob;
}
public void setMob(String mob) {
	System.out.println("in setmobile");
	this.mob = mob;
}
@Override
public String toString() {
	return "Customer [cid=" + cid + ", cname=" + cname + ", mob=" + mob + "]";
}
   
}
