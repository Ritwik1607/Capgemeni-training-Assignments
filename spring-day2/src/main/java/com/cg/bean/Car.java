package com.cg.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
//@Service
//@Repository
public class Car {
	@Value("${carname}")
	private String name;
	@Autowired
	@Qualifier("cng")
	private IEngine engine;	
	@Autowired
	@Qualifier("JKTyre")
	private ITyre mrf;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car( IEngine engine, ITyre mrf) {
		super();
		this.engine = engine;
		this.mrf = mrf;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	public IEngine getEngine() {
		return engine;
	}

	public void setEngine(IEngine engine) {
		this.engine = engine;
	}

	public ITyre getMrf() {
		return mrf;
	}
	public void setMrf(ITyre mrf) {
		this.mrf = mrf;
	}
	public void printCar() {
		System.out.println("Car Name: "+name);
		System.out.println("BHP: "+engine.getBHP());
		System.out.println("Tyre Details: "+mrf.getTyreDetails());
	}
	
}
