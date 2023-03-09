package com.enway.main;

public interface SqlScripts {
	
	static final String sqlUtenteInsert = "insert into utente(first_name, last_name, age) values(?,?,?)";
	
	static final String sqlAcademyInsert = "insert into academy(academy_code, subject, number_of_students) values(?,?,?)";
	
	static final String sqlJointInsert = "insert into academy_utente(id_utente, id_academy) values(?,?)";
 	
	static final String sqlUtenteDelete = "delete from utente where id=?";
	
	static final String sqlAcademyDelete = "delete from academy where id=?";
	
	static final String sqlUtenteUpdate = "update utente set first_name=?, last_name=?, age=? where id=?";
	
	static final String sqlAcademyUpdate = "update academy set academy_code=?, subject=?, number_of_students=? where id=?";
	
	static final String sqlUtenteRead = "select * from utente";
	
	static final String sqlAcademyRead = "select * from academy";
	
	static final String sqlSelectMaxAcademyId = "select max(id) from academy";
	
	static final String sqlSelectMaxUtenteId = "celect max(id) from utente";

}
