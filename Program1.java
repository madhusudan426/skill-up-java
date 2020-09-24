package pack1;
import java .util.*;
public class Program1 {

	public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
System.out.println("enter the values of area");
int a = obj.nextInt();
int b = obj.nextInt();
int c = obj.nextInt();
int d = obj.nextInt();
int  sp = (a+b+c+d)/2;
double area = Math.sqrt((sp-a)*(sp-b)*(sp-c)*(sp-d));
System.out.println("the of quadrrilateral=" +area);

	}

}
