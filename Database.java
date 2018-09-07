package com.jaya.database;

import java.util.ArrayList;

import Student_details.Student;

public class Database {

	private static ArrayList<Student> list;
	
	public static ArrayList<Student> getList() {
		return list;
	}

	//public static ArrayList<Student> getAllGradeList() {
		
	
	public static ArrayList<Student> getAllGradeList() {
		
		
		list = new ArrayList<>();
		
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		Student s5=new Student();
		Student s6=new Student();
		Student s7=new Student();
		Student s8=new Student();
		Student s9=new Student();
		Student s10=new Student();
		
		
		s1.setId(101);
		s1.setName("Tina");
		s1.setComputer(80);
		s1.setLang_1(78);
		s1.setLang_2(84);
		s1.setMaths(60);
		s1.setScience(50);
		s1.evaluateGrade();
		
		s2.setId(102);
		s2.setName("Arohi");
		s2.setComputer(50);
		s2.setLang_1(60);
		s2.setLang_2(50);
		s2.setMaths(70);
		s2.setScience(60);
		s2.evaluateGrade();
		
		s3.setId(103);
		s3.setName("Aryan");
		s3.setComputer(40);
		s3.setLang_1(58);
		s3.setLang_2(34);
		s3.setMaths(70);
		s3.setScience(65);
		s3.evaluateGrade();
		
		s4.setId(104);
		s4.setName("Arjun");
		s4.setComputer(80);
		s4.setLang_1(78);
		s4.setLang_2(84);
		s4.setMaths(60);
		s4.setScience(50);
		s4.evaluateGrade();
		
		s5.setId(105);
		s5.setName("Sonali");
		s5.setComputer(70);
		s5.setLang_1(88);
		s5.setLang_2(84);
		s5.setMaths(90);
		s5.setScience(88);
		s5.evaluateGrade();
		
		s6.setId(106);
		s6.setName("Miha");
		s6.setComputer(70);
		s6.setLang_1(68);
		s6.setLang_2(84);
		s6.setMaths(56);
		s6.setScience(87);
		s6.evaluateGrade();
		
		s7.setId(107);
		s7.setName("Akash");
		s7.setComputer(90);
		s7.setLang_1(58);
		s7.setLang_2(87);
		s7.setMaths(90);
		s7.setScience(88);
		s7.evaluateGrade();
		
		s8.setId(108);
		s8.setName("Rahul");
		s8.setComputer(70);
		s8.setLang_1(88);
		s8.setLang_2(84);
		s8.setMaths(90);
		s8.setScience(88);
		s8.evaluateGrade();
		
		s9.setId(105);
		s9.setName("Rohan");
		s9.setComputer(30);
		s9.setLang_1(20);
		s9.setLang_2(14);
		s9.setMaths(30);
		s9.setScience(18);
		s9.evaluateGrade();
	
		s10.setId(105);
		s10.setName("Sona");
		s10.setComputer(90);
		s10.setLang_1(98);
		s10.setLang_2(84);
		s10.setMaths(90);
		s10.setScience(88);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		list.add(s7);
		list.add(s8);
		list.add(s9);
		list.add(s10);
		
		
		
		return list;
	}
	
	}

	
		
		
	

