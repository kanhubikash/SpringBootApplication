package com.example.demo.dto;

import java.io.Serializable;

public class StudentDTO implements Serializable {

	private String sname;
	private String addrs;
	private String course;
	private String hobbies;
	private String qlfy;

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getAddrs() {
		return addrs;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getQlfy() {
		return qlfy;
	}

	public void setQlfy(String qlfy) {
		this.qlfy = qlfy;
	}

	@Override
	public String toString() {
		return "StudentDTO [sname=" + sname + ", addrs=" + addrs + ", course=" + course + ", hobbies=" + hobbies
				+ ", qlfy=" + qlfy + "]";
	}
}
