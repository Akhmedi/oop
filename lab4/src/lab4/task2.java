package lab4;
import java.util.Scanner;
import java.util.Vector;

public class task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Person> users = new Vector<>();
		while(true) {
			System.out.println("1. Create Person");
			System.out.println("2. Create Student");
			System.out.println("3. Create Staff");
			System.out.println("4. Show all");
			System.out.println("5. Exit");
			System.out.println("Type please: ");
			System.out.println("");
			
			if(!scanner.hasNextInt()) {
				System.out.println("print num");
				scanner.nextLine();
				continue;
			}
			
			int choise = scanner.nextInt();
			scanner.nextLine();
			if (choise == 5)break;
			
			if(choise == 4) {
				if(users.isEmpty()) {
					System.out.println("empty");
				}
				else {
					for(Person p: users) {
						System.out.println(p.toString());
					}
				}
				continue;
			}
			
			if(choise >= 1 && choise <= 3) {
				System.out.println("Enter name: ");
				String name = scanner.nextLine();
				System.out.println("Enter address: ");
				String address = scanner.nextLine();
				
				if(choise == 1) {
					users.add(new Person(name, address));
				}
				else if(choise == 2){
					System.out.println("Enter program: ");
					String prog = scanner.nextLine();
					System.out.println("Enter year: ");
					int year = scanner.nextInt();
					System.out.println("Enter fee: ");
					scanner.nextLine();
					double fee = scanner.nextDouble();
					users.add(new Student(name, address,prog,year,fee));
					scanner.nextLine();
				}
				else if(choise == 3) {
					System.out.println("Enter school: ");
					String school = scanner.nextLine();
					System.out.println("Enter pay: ");
					double pay = scanner.nextDouble();
					scanner.nextLine();
					users.add(new Staff(name, address,school,pay));
				}
			}
		}
	}
}

class Person{
	private String name;
	private String address;
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public String getAdress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		return "Person[name= " + name + " ,address= " + address + "]";
	}
}

class Student extends Person {
	private String program;
	private int year; 
	private double fee;
	
	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	
	@Override
	public String toString() {
        return "Student[" + super.toString() + " ,program=" + program + " ,year=" + year + " ,fee=" + fee + "]";
    }
}

class Staff extends Person{
	private String school;
	private double pay;
	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}
	
	@Override 
	public String toString(){
		return "Staff[" + super.toString() + " ,school=" + school + " ,pay=" + pay + "]";
	}
}
