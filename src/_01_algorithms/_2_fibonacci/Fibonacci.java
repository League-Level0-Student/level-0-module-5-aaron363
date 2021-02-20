package _01_algorithms._2_fibonacci;

public class Fibonacci {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 1;
		for(int i = 0; i < 6; i++) {
			System.out.println(num1);
			num1 = num1 + num2;
			System.out.println(num2);
			num2 = num1 + num2;	
		}				
	}
}
