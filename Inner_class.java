package pack4;

class Outer_class {
	int a = 20;
private class Inner_class
{
	int x = 30;
	public void print()
	{
		System.out.println("inner values="+x + "         "+a);
	}
	}
	void Display_Inner_class()
	{
Inner_class obj = new Inner_class();
 obj.print();
System.out.println("inner class value=" +obj.x);
}
}
public  class Inner_class
{
	public static void main(String[] args)
	{
Outer_class obj = new Outer_class();
obj.Display_Inner_class();
		
	}
}

