package lab2;

public class task2 {
	public static void main(String args[]) {
		StarTriangle n = new StarTriangle(9);
		String result = n.toString();
		System.out.println(result);
	}
}

class StarTriangle{
	private int width;
	public StarTriangle() {
		this.width = 1;
	}
	public StarTriangle(int width) {
		this.width = width;
	}
	public String toString() {
		String res = "";
		for(int i = 1; i <= width;i++) {
			for(int j = 1;j <= i;j++) {
				res += "[*]";
			}
			res += "\n";
		}
		return res;
	}
}