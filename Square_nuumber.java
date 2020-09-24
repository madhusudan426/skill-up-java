package program1;
import java.util.*;

public class Square_nuumber {

	public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
System.out.println("enter the number");
int a = obj.nextInt();
double x = Math.sqrt(a);
if((x - Math.floor(x)) == 0)
System.out.println("square number");
else
	System.out.println("not Square");

	
	}

}
