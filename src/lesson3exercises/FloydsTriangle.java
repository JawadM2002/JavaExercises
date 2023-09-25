package lesson3exercises;

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
		int noOfRows;
		System.out.print("Numbers of rows: ");
		Scanner in = new Scanner(System.in);
				noOfRows = in.nextInt();
		int number = 1;
		for (int row = 1; row <= noOfRows; row++) {
			for (int column = 1; column <= row; column++) {
				System.out.println(number + " ");
				number++;
			}
			System.out.println();
		}
			

	}

}
