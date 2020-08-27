package pack2;
import java.util.*;
public class Array2 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter array size:");
		int n = obj.nextInt();  //8
		
		int a[]=new int[n];
		
		System.out.println("enter "+ n + " array values:");
		for(int i = 0; i<n; i++)  // i is local var
		{
			a[i] = obj.nextInt();
		}
		
		System.out.println("values \t index");
		for(int i = 0; i<n; i++)
		{
			if (a[i]%2 == 0)
			{
				System.out.println(a[i]+"\t"+i);
			}
		}
	}
}
