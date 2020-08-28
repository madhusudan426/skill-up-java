package pack3;
class A1
{
public void add(int x, int y)
{
	System.out.println("add=" + (x+y));
}

}
class Oops1 {

	public static void main(String[] args) {
		A1 obj = new A1();
		obj.add(10,30);
		System.out.println("mainclass");
	}

}
