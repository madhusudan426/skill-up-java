
package pack3;

class F1  // parent class
{
	int a=100,b = 20;
	void add()
	{		 
		System.out.println(" Add = "+(a+b));
	}
}
class G1 extends F1 // child class
{
	void sub()
	{		
		super.add();
		System.out.println("sub = "+(super.a-super.b));
	}
}
public class File4
{
	public static void main(String[] args) 
	{
       G1 obj = new G1();
       obj.sub();       
	}
}

