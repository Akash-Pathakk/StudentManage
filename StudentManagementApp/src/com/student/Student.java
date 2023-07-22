package com.student;

public class Student {
	private int studentId;
	private String studendName;
	private String studentPhone;
	private String studentCity;
	
	public Student(int studentId, String studendName, String studentPhone, String studentCity) {
		super();
		this.studentId = studentId;
		this.studendName = studendName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
	}

	public Student(String studendName, String studentPhone, String studentCity) {
		super();
		this.studendName = studendName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudendName() {
		return studendName;
	}

	public void setStudendName(String studendName) {
		this.studendName = studendName;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studendName=" + studendName + ", studentPhone=" + studentPhone
				+ ", studentCity=" + studentCity + "]";
	}
	
	
	
	
}
