package com.enway.dao;

import java.sql.*;

import com.enway.connection.ConnectionManager;
import com.enway.dto.AcademyDTO;
import com.enway.dto.UtenteAcademyDTO;
import com.enway.dto.UtenteDTO;

public class AcademyUtenteDAOImpl implements AcademyUtenteDAO{

	@Override
	public void addAcademy(String sql, AcademyDTO academyDTO) {
		PreparedStatement ps = ConnectionManager.getPreparedStatement(sql);
		try {
			ps.setString(1, academyDTO.getAcademyCode());
			ps.setString(2, academyDTO.getSubject());
			ps.setInt(3, academyDTO.getNumberOfStudents());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void addUtente(String sql, UtenteDTO utenteDTO) {
		PreparedStatement ps = ConnectionManager.getPreparedStatement(sql);
		try {
			ps.setString(1, utenteDTO.getFirstName());
			ps.setString(2, utenteDTO.getLastName());
			ps.setInt(3, utenteDTO.getAge());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void addUtenteAcademy(String sql, UtenteAcademyDTO utenteAcademyDTO) {
		PreparedStatement ps = ConnectionManager.getPreparedStatement(sql);
		try {
			ps.setString(1, utenteAcademyDTO.getAcademyCode());
			ps.setInt(2, utenteAcademyDTO.getStudentId());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void selectUtenteByAcademy(String sql, int academyId) {
		PreparedStatement ps = ConnectionManager.getPreparedStatement(sql);
		try {
			ps.setInt(1, academyId);
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.toString());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
