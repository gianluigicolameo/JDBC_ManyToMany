package com.enway.dao;

import java.sql.*;

import com.enway.dto.AcademyDTO;
import com.enway.dto.UtenteAcademyDTO;
import com.enway.dto.UtenteDTO;

public class AcademyUtenteDAOImpl implements AcademyUtenteDAO{

	@Override
	public void addAcademy(String sql, AcademyDTO academyDTO) {
		PreparedStatement ps = ConnectionManager.getpreparedStatement();
		
	}

	@Override
	public void addUtente(String sql, UtenteDTO utenteDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addUtenteAcademy(String sql, UtenteAcademyDTO utenteAcademyDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectUtenteByAcademy(String sql, int id) {
		// TODO Auto-generated method stub
		
	}

}
