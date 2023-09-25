package lesson4And5exercises.ProductofThreeIntegersOOP;

import java.util.Scanner;

public class ThreeIntegerOOP {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int no1;
		int no2;
		int no3;
		
		System.out.println("First Number: ");
		no1 = in.nextInt();
		
		System.out.println("Second Number: ");
		no2 = in.nextInt();
		
		System.out.println("Third Number: ");
		no3 = in.nextInt();
		
		System.out.printf("Product of three numbers is %d", no1 * no2 * no3);

	}

}
