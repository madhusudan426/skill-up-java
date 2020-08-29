package pack4;
import java.util.*;

public class Simple_intrest {//p*r*n\100

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("p=\n" +"r=\n" +"n=\n");
int p = obj.nextInt();
int r = obj.nextInt();
int n = obj.nextInt();
int si = (p*r*n)/100; 
	
System.out.println("simpleintrest=" +si);
	}

}
