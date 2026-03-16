package com.cg.bean;

import org.springframework.stereotype.Component;

@Component
public class JKTyre implements ITyre{
	public String getTyreDetails() {
		return "JK Tyre";
	}
}
