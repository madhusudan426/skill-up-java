package pack4;

class Multi_class
{
static class Inner_class
{
static class Inner_class2
{
public void print()	
{
	System.out.println("inner static value");
}}}
}
public class Multiple_inner {

	public static void main(String[] args) {
		
		Multi_class.Inner_class.Inner_class2 obj = new Multi_class.Inner_class.Inner_class2();
		obj.print();
	}

}

