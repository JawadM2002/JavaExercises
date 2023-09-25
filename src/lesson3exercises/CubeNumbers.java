package lesson3exercises;

import java.util.Scanner;

public class CubeNumbers {

	public static void main(String[] args) {
		int i, num;
		
		System.out.print("Number of terms: ");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		
		for(i=1; i<=num; i++) {
			System.out.println("Number: " +i+" and cube of "+i+ " is "+(i*i*i));
		}

	}

}
