package lab3;

public class task5 {
	public static void main(String[] args) {
		DragonLaunch dl = new DragonLaunch();
		
		dl.kidnap(new Person("A", Gender.BOY));
		dl.kidnap(new Person("G", Gender.GIRL));
		dl.kidnap(new Person("H", Gender.BOY));
		
		boolean dragonEats = dl.willDragonEatOrNot();
		System.out.println(dl.getLineString());
		if(dragonEats) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}

enum Gender{
	BOY, GIRL
}

class Person{
	private String name;
	private Gender gender;
	
	public Person(String name, Gender gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public Gender getGender() {
        return gender;
    }
	
	public String toString() {
		return name + "(" + (gender == Gender.BOY ? "B" : "G") + ")";
	}
}

class DragonLaunch {
	private String line = "";
	public void kidnap(Person p) {
		if(p.getGender() == Gender.BOY) {
			line += "B";
		}
		else {
			line += "G";
		}
	}
	
	public boolean willDragonEatOrNot() {
		boolean changed = true;
		while(changed) {
			changed = false;
			for(int i = 0;i < line.length()-1;i++) {
				if(line.charAt(i)=='B' && line.charAt(i+1)=='G') {
					line = line.substring(0, i) + line.substring(i+2);
					changed = true;
					break;
				}
			}
		}
		return line.length() > 0;
	}
	
	public String getLineString() {
		if(line.length() == 0) return "empty";
		return line;
	}
	
}
