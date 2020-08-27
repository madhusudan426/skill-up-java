package pack;

import java.util.Scanner;

public class area_rectangle {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("enter the value of length");
		int length = obj.nextInt();
		
		System.out.println ("enter the value of breadth");
		int breadth = obj.nextInt();
		
		int a = length*breadth;
		
		System.out.println("area ofthe rectangle=" + a);
 		
	}

}
