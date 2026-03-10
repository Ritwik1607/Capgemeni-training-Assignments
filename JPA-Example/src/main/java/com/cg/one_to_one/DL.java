package com.cg.one_to_one;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DL {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int dlNo;
	private LocalDate expDate;
	private LocalDate issueDate;
	private String type;

	public DL() {
		
	}

	public DL(LocalDate expDate, LocalDate issueDate, String type) {
		super();
		this.expDate = expDate;
		this.issueDate = issueDate;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "DL [dlNo=" + dlNo + ", expDate=" + expDate + ", issueDate=" + issueDate + ", type=" + type + "]";
	}

	public void setDL(int id) {
		this.dlNo = id;
	}
	public int getDlNo() {
		return dlNo;
	}

	public void setDlNo(int dlNo) {
		this.dlNo = dlNo;
	}

	public LocalDate getExpDate() {
		return expDate;
	}

	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
