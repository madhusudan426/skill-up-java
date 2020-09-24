package pack1;
import java.util.*;

public class Fibnoseries {

	public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
System.out.println("enter the number");
int n = obj.nextInt();
int t1=0 , t2=1;
for(int i = 1; i<=n; i++);
int sum = t1+t2;
t1=t2;
t2=sum;
System.out.println("the fibnories number=" +sum);
	}

	

}
