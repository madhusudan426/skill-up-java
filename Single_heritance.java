package pack3;
class Student
{
	String name;
	int roll_no;
	Student(String name, int roll_no)
	{
	this.name = name;
	this.roll_no = roll_no;
	}
		void showStudent()
	{
		System.out.println("name=" + name + "\t roll_no=" + roll_no);
	}
}	

class marks extends Student
{
	int m1,m2;
	marks(String name,int roll_no,int m1,int m2)
	{
		super(name,roll_no);
		this.m1 = m1;
		this.m2 = m2;
	}
void showmarks()
{
System.out.println("marks1=" + m1 + "\t marks2=" + m2);
}
}
public class Single_heritance {

	public static void main(String[] args)
	{
		marks obj = new marks("sai",26,100,99);
		obj.showmarks();
		obj.showStudent();
	}
		}

