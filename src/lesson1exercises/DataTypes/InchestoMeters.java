package lesson1exercises.DataTypes;
import java.util.Scanner;

public class InchestoMeters {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input number for inches: ");
		double inch = input.nextDouble();
		double meters = inch * 0.0254;
		
		System.out.println("the inch is " + inch);
		System.out.println("meters are " + meters);

	}

}