package lesson2exercises;
import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input the number: ");
		int input = in.nextInt();
		
		if (input % 2 == 0) {
			System.out.println("The number is even");
		}
		else {
			System.out.println("The number is odd");
		}

	}

}