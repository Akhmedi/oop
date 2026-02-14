package lab3;
import java.util.Scanner;

public class Analyzer {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Data data = new Data();
		
		while(true) {
			System.out.print("enter number(Q to quit): ");
			String t = in.next().trim();
			
			if(t.equalsIgnoreCase("Q")) {
				break;
			}
			
			t = t.replace(',', '.');
			
			try {
                double value = Double.parseDouble(t);
                data.add(value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Try again.");
            }
		}
		
		System.out.println("Average=" + data.getAverage());
		System.out.println("Max=" + data.getLargest());
	}
}

class Data {
	private double sum;
	private double max;
	private int count;
	
	public Data() {
		sum = 0.0;
		max = 0.0;
		count = 0;
	}
	
	public void add(double value) {
		sum += value;
		
		if(count == 0 || value > max) {
			max = value;
		}
		count++;
	}
	
	public double getAverage() {
		if(count == 0) {
			return 0.0;
		}
		return sum / count;
	}
	
	public double getLargest() {
		if(count == 0)return 0.0;
		return max;
	}
}