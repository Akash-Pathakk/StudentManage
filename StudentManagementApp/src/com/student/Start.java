package com.student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Student Management App");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("PRESS 1 to  ADD Student");
			System.out.println("PRESS 2 to  DELETE Student");
			System.out.println("PRESS 3 to display stdent");
			System.out.println("PRESS 4 to exit app");
			
			
			int c=Integer.parseInt(br.readLine());
			 
			if(c==1) {
//				add student
				System.out.println("Enter user name :");
				String name=br.readLine();
				
				System.out.println("Enter user phone :");
				String phone=br.readLine();
				
				System.out.println("Enter user city :");
				String city=br.readLine();
				
//				create student object to store student
				Student st =new Student(name, phone,city);
				boolean answer=StudentDb.insertStudent(st);
				if(answer) {
					System.out.println("Student is added successfully...");
				}else {
					System.out.println("Something went wrong");
				}
				System.out.println(st);
				
				
				
				
			} else if(c==2) {
//				delee student
				System.out.println("Enter student id");
				int userid=Integer.parseInt(br.readLine());
				boolean f=StudentDb.deleteStudent(userid);
				if(f) {
					System.out.println("Student is deleted successfully...");
				}else {
					System.out.println("Something went wrong");
				}
				
			} else if(c==3) {{
//				display student
				StudentDb.showAll();
			}
		} else if (c==4) {
//			exit
			break;
		} else {
			
		}
	}	
		System.out.println("Thankyou for using this...");
			
}
	
}
