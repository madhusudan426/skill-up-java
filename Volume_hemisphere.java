package pack5; 
import java.util.*;

public class Volume_hemisphere {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the radius:");
		float r = obj.nextFloat();
		float v = (float) (3.14*(r*r*r)*2/3);
		System.out.println("the volue of hemisphere="+v);

	}

}
