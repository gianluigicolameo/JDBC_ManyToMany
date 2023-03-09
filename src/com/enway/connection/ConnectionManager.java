package com.enway.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionManager implements ConnectionParameters{
	
	public static Connection openConnection() {
		
		Connection con = null;
		
		try {
			Class.forName(driverConnection);
			
			con = DriverManager.getConnection(dbUrl, dbUser, dbPass);
		} catch (ClassNotFoundException | SQLException e) {		
			e.printStackTrace();
			
			System.out.println("Errore apertura connessione");
		}
		
		return con;
	}
	
	public static PreparedStatement getPreparedStatement(String sql) {
		
		PreparedStatement ps = null;
		
		try {
			ps = openConnection().prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			
			System.out.println("Errore PreparedStatement");
		}
		
		return ps;
	}

	public static ResultSet getResultSet(String sql) {
		
		Statement st = null;
		ResultSet rs = null;
		
		try {
			st = openConnection().createStatement();
			
			rs = st.executeQuery(sql);
		} catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println("Errore ResultSet");
		}
		
		return rs;
		
	}
	
	public static void closeConnection() {
		
		try {
			openConnection().close();
		} catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println("Errore chiusura");
		}
		
	}

}
