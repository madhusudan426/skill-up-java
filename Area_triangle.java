package pack;


import java.util.Scanner;

public class Area_triangle {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("enter the value of base");
		Float b = obj.nextFloat();
		
		System.out.println("enter the value of height");
		Float h = obj.nextFloat();
		
		Float  formula = (b*h)/2;
		
		System.out.println("the value area of triangle=" + formula);
	}

}
