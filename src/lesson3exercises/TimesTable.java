package lesson3exercises;

import java.util.Scanner;

public class TimesTable {

	public static void main(String[] args) {
		int i, num;
		
		System.out.print("Number of terms: ");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		
		System.out.println("\n");	
		for(i = 0; i <= num; i++) { // for any numbers from 0 to the number of terms
			System.out.println(num +" multiplied by "+i+ " is "+ num*i); // the number of terms will be multiplied with the selected

	}

}
}
