package com.enway.main;

import com.enway.dao.AcademyUtenteDAO;
import com.enway.dao.AcademyUtenteDAOImpl;
import com.enway.dto.AcademyDTO;
import com.enway.dto.UtenteAcademyDTO;
import com.enway.dto.UtenteDTO;

public class Main {

	public static void main(String[] args) {
		
		AcademyUtenteDAO academyUtenteDao = new AcademyUtenteDAOImpl();
		
		AcademyDTO academyDto1 = new AcademyDTO("A123", "Java", 20);
		academyUtenteDao.addAcademy(SqlScripts.sqlAcademyInsert, academyDto1);
		
		UtenteDTO utenteDto1 = new UtenteDTO("Flavio", "Menchinelli", 46);
		academyUtenteDao.addUtente(SqlScripts.sqlUtenteInsert, utenteDto1);
		
		UtenteAcademyDTO utenteAcademyDto1 = new UtenteAcademyDTO();

	}

}
