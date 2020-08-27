package pack;

import java.util.Scanner;

public class Radius {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("radius");
		Float r = obj.nextFloat();
		
		Float w = 2*3.14f*r;
				
		System.out.println("the value of radius =" + w);
		
	}

}
