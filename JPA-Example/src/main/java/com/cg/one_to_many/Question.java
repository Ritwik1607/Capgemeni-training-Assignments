package com.cg.one_to_many;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int qid;
	private String qName;
	private String level;
	@OneToMany(mappedBy = "question" ,  cascade = CascadeType.ALL)
	private List<Answer> answer;
	
	
	
	public Question() {
		
	}
	
	
	public Question(String qName, String level) {
		super();
		this.qName = qName;
		this.level = level;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getqName() {
		return qName;
	}
	public void setqName(String qName) {
		this.qName = qName;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public List<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}


	@Override
	public String toString() {
		return "Question [qid=" + qid + ", qName=" + qName + ", level=" + level + ", answer=" + answer + "]";
	}
	
	
	
	
	
	

}
