package lesson1exercises.DataTypes;
import java.util.Scanner;

public class InputProductofTwoNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input number one: ");
		int num1 = in.nextInt();
		
		System.out.print("Input number two: ");
		int num2 = in.nextInt();
		
		System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
	}

}
