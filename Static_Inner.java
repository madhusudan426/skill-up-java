package pack4;
class Static_class
{
static class Inner_class
{
public void mymethod()	
{
	System.out.println("inner static value");
}
}}
public class Static_Inner {

	public static void main(String[] args) {
		
		Static_class.Inner_class obj = new Static_class.Inner_class();
		obj.mymethod();
	}

}
