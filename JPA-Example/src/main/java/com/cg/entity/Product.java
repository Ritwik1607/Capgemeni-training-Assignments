package com.cg.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "productdata")
public class Product {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "product_pid")
	private int pid;
	@Column(name = "product_name")
	private String name;
	@Column(name = "product_price")
	private double price;
	@Column(name = "product_qty")
	private int qty;
	@Column(name = "product_dom")
	private LocalDate dom;
	
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + ", qty=" + qty + ", dom=" + dom + "]";
	}

	public Product() {
		
	}

	public Product( String name, double price, int qty, LocalDate dom) {
		super();
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.dom = dom;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public LocalDate getDom() {
		return dom;
	}

	public void setDom(LocalDate dom) {
		this.dom = dom;
	}

}
