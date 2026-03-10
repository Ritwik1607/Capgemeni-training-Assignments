package com.cg.one_to_one;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	private String name;
	private LocalDate dob;
	@OneToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	@JoinColumn(name = "dl")
	private DL dl;

	public Person() {

	}

	public Person(String name, LocalDate dob) {
		super();
		this.name = name;
		this.dob = dob;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	public void setDl(DL dl) {
		this.dl = dl;
	}
	
	public DL getDL() {
		return dl;
	}
	
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", dob=" + dob + ", dl=" + dl + "]";
	}
}
