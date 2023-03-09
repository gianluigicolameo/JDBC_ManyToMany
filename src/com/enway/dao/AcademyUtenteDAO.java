package com.enway.dao;

import com.enway.dto.AcademyDTO;
import com.enway.dto.UtenteAcademyDTO;
import com.enway.dto.UtenteDTO;

public interface AcademyUtenteDAO {
	public void addAcademy(String sql, AcademyDTO academyDTO);
	
	public void addUtente(String sql, UtenteDTO utenteDTO);
	
	public void addUtenteAcademy(String sql, UtenteAcademyDTO utenteAcademyDTO);
	
	public void selectUtenteByAcademy(String sql, String academyCode);
}
