package pack2;

import java.util.*;

public class biggest_number {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the numbers");
		int a = obj.nextInt();
		int b = obj.nextInt();
		int c = obj.nextInt();
		int d = obj.nextInt();
		if(a>b && a>c && a>d)
		System.out.println("biggest number=" + a);
		
		if(b>c && c>d)
		System.out.println("biggest number=" + b);
		
		else if(c>d)
		System.out.println("biggest number=" + c);
		
		else 
			System.out.println("biggest number=" + d);
		
		
		
	}

}
