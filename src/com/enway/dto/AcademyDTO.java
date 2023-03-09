package com.enway.dto;

import java.io.Serializable;

public class AcademyDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String academyCode;
	
	private String subject;
	
	private int numberOfStudents;

	public String getAcademyCode() {
		return academyCode;
	}

	public void setAcademyCode(String academyCode) {
		this.academyCode = academyCode;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public AcademyDTO(String academyCode, String subject, int numberOfStudents) {
		super();
		this.academyCode = academyCode;
		this.subject = subject;
		this.numberOfStudents = numberOfStudents;
	}

	
	
	
}
