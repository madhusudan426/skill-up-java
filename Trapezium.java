package pack5;
import java.util.*;
public class Trapezium {

	public static void main(String[] args) {//a+b*h/2
		Scanner obj = new Scanner(System.in);
		System.out.println("enter a,b,h");
		float a = obj.nextFloat();
		float b = obj.nextFloat();
		float h = obj.nextFloat();
		float v = (float) (a+b)*(h/2f);
		System.out.println("tve volume of traezium="+v);

	}

}
