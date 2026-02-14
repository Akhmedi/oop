package lab3;

public class task3 {
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

class Temperature{
	private double value;
	private char scale;
	
	public Temperature() {
		this.value = 0;
		this.scale = 'C';
	}
	
	public Temperature(double value) {
		this.value = value;
		this.scale = 'C';
	}
	
	public Temperature(char scale) {
		this.value = 0;
		setScale(scale);
	}
	
	public Temperature(double value, char scale) {
		this.value = value;
		setScale(scale);
	}
	
	public double getFahrenheit() {
		if(scale == 'F') {
			return value;
		}
		else {
			return (9 * value / 5)+ 32;
		}
	}
	
	public double getCelsius() {
        if (scale == 'C') {
            return value;
        } else {
            return 5 * (value - 32) / 9;
        }
    }
	
	public void setValue(double value) {
		this.value = value;
	}
	
	public void setScale(char scale) {
        if (scale == 'C' || scale == 'F') {
            this.scale = scale;
        } else {
            System.out.println("Must be 'C' or 'F'");
        }
    }
	
	public void set(double value, char scale) {
		this.value = value;
		setScale(scale);
	}
	
	public char getScale() {
		return scale;
	}
}
