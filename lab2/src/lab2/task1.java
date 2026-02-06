package lab2;
import java.util.Scanner;
public class task1 {
	public static void main(String args[]) {
		Student student1 = new Student("Akhmedi", 19);
		student1.setYos(2);
		System.out.println(student1.getName());
		System.out.println(student1.getId());
		System.out.println(student1.getYos());
	}
	
}

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