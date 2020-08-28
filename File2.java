package pack3;
class C1
{
public void add(int x,int y)
{
	System.out.println("add=" + (x+y));
}
}
class B1
{
	public void sub(int a,int b)
	{
		System.out.println("sub=" + (a-b));
	}
}
public class File2 
{
	public static void main(String[] args) 
	{
		C1 obj = new C1();
		obj.add(30,40);
		B1 obj2 = new B1();
		obj2.sub(20,40);
		System.out.println("main class");
	}

}
