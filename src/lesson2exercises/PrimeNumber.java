package lesson2exercises;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int no;
        int dividers = 0;
    
        System.out.print("Input a number: ");
        no = Integer.parseInt(new Scanner(System.in).nextLine());

        for (int i = 1; i <= no; i++) {
            if (no % i == 0){
                dividers++;
        }
    }
        if (dividers == 2) {
            System.out.println("True - Prime");
		}
            else {
                System.out.println("False - Not Prime");
	}
    }
}
