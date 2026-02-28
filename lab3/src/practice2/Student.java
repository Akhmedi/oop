package practice2;

import java.util.Scanner;

class Student{
	private String name;
	private int id;
	private int year_of_study;
	
	public Student() {
		this.name = "Nothing";
		this.id = 0;
		this.year_of_study = 1;
	}
	
	public Student(String username, int id) {
		this.name = username;
		this.id = id;
		this.year_of_study = 1;
	}
	
	public void setYos(int year) {
		this.year_of_study = year;
	}
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public int getYos() {
		return year_of_study;
	}
}