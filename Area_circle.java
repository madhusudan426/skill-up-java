package pack;

import java.util.Scanner;

public class Area_circle {

	public static void main(String[] args){
		
		Scanner obj = new Scanner(System.in);
		
		System.out .println("enter the area of circle");
		Float r = obj.nextFloat();
		
		Float formula = 3.14f*r*r;
		
		System.out.println("the value of area of cicle =" + formula);
		System.out.printf("%1.5f",formula);
	}

}
