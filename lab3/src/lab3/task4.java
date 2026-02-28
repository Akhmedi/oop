package lab3;

import java.util.Scanner;
import practice2.Student;

public class task4 {
	public static void main(String[] args) {
		Temperature t1 = new Temperature();
		Temperature t2 = new Temperature(100);
		Temperature t3 = new Temperature('F');
		Temperature t4 = new Temperature(30, 'F');
		
		System.out.println("t4 in Celsius: " + t4.getCelsius());
		
		t4.setValue(0);
		t4.setScale('C');
		System.out.println("t4 in F: " + t4.getFahrenheit());
	}
}

