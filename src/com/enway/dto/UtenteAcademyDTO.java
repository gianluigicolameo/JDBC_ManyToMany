package com.enway.dto;

public class UtenteAcademyDTO {
	
	private int idAcademy;
	
	private int idStudent;

	public int getIdAcademy() {
		return idAcademy;
	}

	public void setIdAcademy(int idAcademy) {
		this.idAcademy = idAcademy;
	}

	public int getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}

	public UtenteAcademyDTO(int idAcademy, int idStudent) {
		super();
		this.idAcademy = idAcademy;
		this.idStudent = idStudent;
	}
	
}
