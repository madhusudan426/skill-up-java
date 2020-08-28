package pack3;
class D1 
{
	public void sub(int x,int y)
	{
		System.out.println("sub=" + (x-y));
	}
}
	class E1 extends D1
		{
			public void mul(int a,int b)
			{
				System.out.println("mul=" + (a*b));
			}
		}
public class File3 {

	public static void main(String[] args) {
		E1 obj = new E1();
		obj.sub(40,30);
		obj.mul(10,30);
		System.out.println("main class");
	}

}
