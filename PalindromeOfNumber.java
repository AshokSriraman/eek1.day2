package week1.day2_assignments;

public class PalindromeOfNumber {

		public static void main(String[] args) {
			int number = 747;
			int temp = number;
			int reverse = 0;
			while (number > 0) {
				int remainder = number % 10;
				int quotient = number / 10;
				reverse = (reverse * 10) + remainder;
				number = quotient;
			}
			System.out.println("Reversed Number: " + reverse);
			if (reverse == temp) {
				System.out.println("Palindrome Number");
			} else {
				System.out.println("Not a Palindrome Number");
			}

		}

	}
