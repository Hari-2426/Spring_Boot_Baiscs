package com.example.demo.dao;

public class StudentData {
	
	private int sid;
	private String sname;
	private int smarks;
	
	public StudentData()
	{
		
	}
	public StudentData(int sid, String sname, int smarks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.smarks = smarks;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSmarks() {
		return smarks;
	}
	public void setSmarks(int smarks) {
		this.smarks = smarks;
	}
	@Override
	public String toString() {
		return "StudentData [sid=" + sid + ", sname=" + sname + ", smarks=" + smarks + "]";
	}
	

}
