package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="STUDENT")
public class Student {

	@Id
	@GenericGenerator(name = "gen1", strategy = "increment")
	@GeneratedValue(generator="gen1")
	private int sno;
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
		return "Student [sno=" + sno + ", sname=" + sname + ", addrs=" + addrs + ", course=" + course + ", hobbies="
				+ hobbies + ", qlfy=" + qlfy + "]";
	}
}
