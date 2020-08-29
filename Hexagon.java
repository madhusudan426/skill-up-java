package pack4;
import java.util.*;
public class Hexagon {

	public static void main(String[] args) {//3*sqrt(3)*s*s(/2
Scanner obj = new Scanner(System.in);
System.out.println("enter the hexagon side");
float s = obj.nextFloat();
float x  = (float) ((3*(Math.sqrt(3))*s*s)/2);
System.out.println("heaxagon:"+x);

	}

}
