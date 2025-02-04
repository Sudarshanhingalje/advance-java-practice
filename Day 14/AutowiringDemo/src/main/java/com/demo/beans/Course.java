package com.demo.beans;

public class Course {
	private int cid;
	private String cname;
	private Faculty f1;
	public Course() {
		super();
		System.out.println("in course default constructor");
	}
	public Course(int cid, String cname, Faculty f1) {
		super();
		System.out.println("in course parametrised constructor");
		this.cid = cid;
		this.cname = cname;
		this.f1 = f1;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		System.out.println("in course setcid");
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		System.out.println("in course setcname");
		this.cname = cname;
	}
	public Faculty getF1() {
		return f1;
	}
	public void setF1(Faculty f1) {
		System.out.println("in course setf1");
		this.f1 = f1;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", f1=" + f1 + "]";
	}
	

}
