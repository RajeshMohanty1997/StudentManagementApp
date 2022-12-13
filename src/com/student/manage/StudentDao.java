package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDao {
	
	public static void insertStudentToDB(Student st) {
		
		try {
			//jdbc code...
			Connection con = CP.createC();
			String q="insert into students(sname,sphone,scity) values(?,?,?)";
			//preparedStatement
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the value of parameter
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setString(3, st.getStudentCity());
			
			//execute...
			pstmt.executeUpdate();
		}catch (Exception e) {
			//TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
	}

}
