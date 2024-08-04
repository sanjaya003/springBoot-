package com.example.helloworld;
import org.springframework.stereotype.Component;

@Component

public class sanji {
	private int eid;
	private String ename;
	private String tech;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	void show()
	{
		System.out.println("hello");
	}

}
