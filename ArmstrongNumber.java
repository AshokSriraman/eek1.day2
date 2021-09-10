package week1.day2_assignments;

import java.util.Iterator;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int number = 82;
		int calculated = 0;
		int original;
		original = number;
		while (number > 0) {
			int remainder = number % 10;
			int quotient = number / 10;
			number = quotient;
			calculated = calculated + (remainder * remainder * remainder);
		}
		System.out.println(original);
		if (original == calculated) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not an Armstrong Number");
		}
	}
}