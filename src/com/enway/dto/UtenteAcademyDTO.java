package com.enway.dto;

public class UtenteAcademyDTO {
	
	private String academyCode;
	
	private int studentId;

	public String getAcademyCode() {
		return academyCode;
	}

	public void setAcademyCode(String academyCode) {
		this.academyCode = academyCode;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public UtenteAcademyDTO(String academyCode, int studentId) {
		super();
		this.academyCode = academyCode;
		this.studentId = studentId;
	}
	
}
