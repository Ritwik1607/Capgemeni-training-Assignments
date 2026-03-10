package org.example;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity

//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "Emp_type")
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int empid;
    private String name;
    private LocalDate dob;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(int empid, String name, LocalDate dob) {
        this.empid = empid;
        this.name = name;
        this.dob = dob;
    }

    public Employee() {
    }

    public Employee(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }
}
