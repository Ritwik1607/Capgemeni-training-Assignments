package com.cg.bean;

import org.springframework.stereotype.Component;

@Component
public class PetrolEngine implements IEngine{
	public String getBHP() {
		return "Petrol Engine with 150 BHP";
	}
}
