package lesson3exercises;

import java.util.Scanner;

public class Input5NumbersandSum {

	public static void main(String[] args) {
		int i,number=0,sum=0;
		double avg;
		{
			System.out.println("Input 5 numbers: ");
		}
		for (i = 0; i < 5; i++) {
			Scanner input = new Scanner(System.in);
			number = input.nextInt();
			
		sum += number;
		}
		avg=sum/5;
		System.out.println("The sum of 5 numbers: " +sum+ "\nThe Average of the five numbers is: " +avg);

	}

}
