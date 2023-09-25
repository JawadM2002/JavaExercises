package lesson2exercises;
import java.util.Scanner;

public class PositiveorNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Input the number: ");
		int input = in.nextInt();
		
		if (input > 0) {
			System.out.println("The number is positive");
		}
		else if (input < 0) {
			System.out.println("The number is negative");
		}
		else {
			System.out.println("Number 0 is not positive or negative");
		}

	}

}
