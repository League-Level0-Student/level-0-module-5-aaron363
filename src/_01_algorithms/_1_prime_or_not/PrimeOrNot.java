package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {

	public static void main(String[] args) {
		String numString = JOptionPane.showInputDialog("Enter Number");
		int num = Integer.parseInt(numString);
		boolean prime = true;
		for(int i = 2; i < num / 2; ++i) {
			if(num % i == 0) {
				prime = false;
				break;
			}
		}
		if(prime) {
			JOptionPane.showMessageDialog(null, "Number is prime.");
		}else {
			JOptionPane.showMessageDialog(null, "Number is not prime.");
		}

	}

}
