package lesson2exercises;

import java.util.Scanner;

public class DivideifNotZero {

	public static void main(String[] args) {
		int number1, number2;
		
		System.out.println("Enter number 1: ");
		number1 = Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.println("Enter number 2: ");
		number2 = Integer.parseInt(new Scanner(System.in).nextLine());
		
		if (number2 != 0) {
			System.out.println("The result is: " + number1 / number2);
		} else {
			if (number2 == 0) {
				System.out.println("No result detected. Please try again.");
			}
		}

	}

}
