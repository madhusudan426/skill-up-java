package pack2;

import java.util.*;

public class Student_details {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("enter sno");
		int sno = obj.nextInt();
		System.out.println("enter name");
		String stname = obj.next(); 
		System.out.println("enter age");
		int stage = obj.nextInt();
		System.out.println("enter fee");
		Float stfee = obj.nextFloat();
		System.out.println(" sno=" + sno+"\n stname=" + stname+"\n stage=" + stage+"\n stfee=" + stfee);
	}

}
