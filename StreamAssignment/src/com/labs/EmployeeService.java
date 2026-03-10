package com.labs;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeService {
	public double sumOfSalary() {
		double totalSal = EmployeeRepository.getEmployees().stream().map(e -> e.getSalary())
				.collect(Collectors.summingDouble(e -> e));
		return totalSal;
	}

	public Map<String, Long> getEmployeeCountByDept() {
		Map<String, Long> m = EmployeeRepository.getEmployees().stream().filter(e -> e.getDepartment() != null)
				.map(e -> e.getDepartment().getDepartmentName())
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		return m;
	}
	
	public List<String> getNameAndServiceDuration() {
		List<String> li=EmployeeRepository.getEmployees().stream().map(e->{
			Period p=Period.between(e.getHireDate(), LocalDate.now());
			int totalMonth=p.getYears()*12+p.getMonths();
			return e.getFirstName()+"\t"+"Total Month: "+totalMonth+" Days: "+p.getDays();
		}).toList();
		return li;
	}
}
