package lab4;

public class task1 {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.makeSound();
		
		Dog dog2 = new Dog("Aktos");
		dog2.makeSound();
		dog2.makeSound(5);
	}
}

class Animal{
	protected String name;
	public Animal() {
		this.name = "No name animal";
	}
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void makeSound() {
		System.out.println("Sound of animal");
	}
}

class Dog extends Animal {
	public Dog() {
		super();
		System.out.println("Dog Default constructor");
	}
	
	public Dog(String name) {
		super(name);
		System.out.println("Dog Constructor with name");
	}
	
	@Override
	public void makeSound() {
		System.out.println(name + " say gaf gaf");
	}
	
	public void makeSound(int times) {
		System.out.println(name + " say gaf " + times + " times: ");
		for(int i = 0;i < times;i++) {
			System.out.println("gaf");
		}
		System.out.println();
	}
}