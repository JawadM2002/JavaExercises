package lesson1exercises.Variables;

public class SwappingVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c, d;
		c = 20;
		d = 15;
		System.out.println("Before: " + c + ", " + d);
		c = c + d;
		d = c - d;
		c = c - d; 
		System.out.println("After: " + c + ", " + d);
	}

}
