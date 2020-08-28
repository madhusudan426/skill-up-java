package pack3;
class bank1
{
	String name;
	int acc_no;
	bank1(String name, int acc_no)
	{
	this.name = name;
	this.acc_no = acc_no;
	}
		void showbank1()
	{
		System.out.println("name=" + name + "\t acc_no=" + acc_no);
	}
}	

class money1 extends bank1
{
	int m1,m2;
	money1(String name,int acc_no,int m1,int m2)
	{
		super(name,acc_no);
		this.m1 = m1;
		this.m2 = m2;
	}
void showmoney1()
{
System.out.println("money1=" + m1 + "\t money2=" + m2);
}
}
class credits extends bank1
{
	String address;
	int ph_no;
	credits(String name,int acc_no,int ph_no,String address)
	{
	super(name,acc_no);
     this.address = address;
      this.ph_no = ph_no;
	}
	void showcredits()
	{
		System.out.println("phone_no="+ph_no+ "\t address=" +address);
	}
}
public class Heirerichial_inheritance {

	public static void main(String[] args) {
		money1 obj = new money1("preveen",18834526,1200,400);
		obj.showmoney1();
		obj.showbank1();
		credits obj2 = new credits("praveen",18834526,9177585,"SAMALKOTA");
		obj2.showcredits();
		obj.showbank1();
	}

}
