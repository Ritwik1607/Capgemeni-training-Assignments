package com.cg.one_to_many;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	private String answer;
	
	@ManyToOne
	@JoinColumn(name = "question_id")
	private Question question;
	
	
	public Answer() {
		
	}
	
	public Answer(String answer , Question question) {
		super();
		this.answer = answer;
		this.question = question;
	}
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "Answer [aid=" + aid + ", answer=" + answer + "]";
	}
	
	
	
}
