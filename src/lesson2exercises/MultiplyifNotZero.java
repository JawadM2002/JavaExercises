package lesson2exercises;

import java.util.Scanner;

public class MultiplyifNotZero {

	public static void main(String[] args) {
		int number1, number2;
		
		System.out.println("Input First Number: ");
		number1 = Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.println("Input Second Number: ");
		number2 = Integer.parseInt(new Scanner(System.in).nextLine());
		
		if (number2 != 0) {
			System.out.println("The result is " + number1 * number2);
		} else {
			System.out.println("Any number multiplied by 0 returns 0.");
		}

	}

}
