package lesson1exercises.DataTypes;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Fahrenheit Input: ");
		double fahren = input.nextDouble();
		
		double celsius = ((5 *(fahren - 32.0)) / 9.0);
		System.out.println(fahren + " degrees Fahrenheit = " + celsius + " degrees celsius");

	}

}
