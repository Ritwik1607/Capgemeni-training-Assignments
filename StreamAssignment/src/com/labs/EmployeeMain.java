package com.labs;

import java.time.LocalDate;
import java.time.Period;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeService es=new EmployeeService();
		//System.out.println(es.getEmployeeCountByDept());
		es.getNameAndServiceDuration().forEach(s->System.out.println(s));
//		LocalDate ld=LocalDate.now();
//		System.out.println(ld);
//		
//		LocalDate ld1=LocalDate.of(2026, 1, 26);
//		
//		Period p=Period.between(ld1, ld);
//		System.out.println(p.getDays()+"Days "+p.getMonths()+"months "+p.getYears()+"Years");
	}

}
