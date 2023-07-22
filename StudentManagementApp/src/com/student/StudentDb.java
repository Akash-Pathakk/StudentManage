package com.student;

import java.sql.*;

public class StudentDb {
	
//	public static void main(String[] args) {
//		insertStudent();
//	}
	
	public static boolean insertStudent(Student st) {
		boolean f=false;
		try {
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_manage","root","");
			System.out.println("Connected to the  database Successfully");
			PreparedStatement pst=connection.prepareStatement("insert into students(sname, sphone, scity) values(?,?,?)");
//			set the value
			pst.setString(1, st.getStudendName());
			pst.setString(2, st.getStudentPhone());
			pst.setString(3, st.getStudentCity());
			
//			execute
			pst.executeUpdate();
			
			f=true;
		
		
		
		} catch (SQLException e) {
			System.out.println("Error while connecting to the databases");
		}	
		// TODO Auto-generated method stub
		return f;
	}

	

	public static boolean deleteStudent(int userid) {
		// TODO Auto-generated method stub
		boolean f=false;
		try {
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_manage","root","");
			System.out.println("Connected to the  database Successfully");
			PreparedStatement pst=connection.prepareStatement("delete from students where sid=?");
//			set the value
			pst.setInt(1, userid);

			
//			execute
			pst.executeUpdate();
			
			f=true;
		
		
		
		} catch (SQLException e) {
			System.out.println("Error while connecting to the databases");
		}	
		// TODO Auto-generated method stub
		return f;
		
	}



	public static void showAll() {
		// TODO Auto-generated method stub
		
		try {
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_manage","root","");
			System.out.println("Connected to the  database Successfully");
//			PreparedStatement pst=connection.prepareStatement("insert into students(sname, sphone, scity) values(?,?,?)");
			Statement stmt = connection.createStatement();
			ResultSet set = stmt.executeQuery("select * from students");
			
			while(set.next()) {
				int id=set.getInt(1);
				String name=set.getString(2);
				String phone=set.getString(3);
				String city=set.getString("scity");
				
				System.out.println("id : "+id+" name : "+name+" Phone : "+phone+" City : "+city);
			}
		
		
		
		
		} catch (SQLException e) {
			System.out.println("Error while connecting to the databases");
		}	
		// TODO Auto-generated method stub
		
		
	}
	

}
