package pack3;
class Bank
{
	String name;
	int account_no;
	Bank()
	{
	 name = "Naveen";
	 account_no = 12;
	}
	
    Bank(int account_no)
    {
    	 name = "praveen";
    this.account_no = account_no;
}
    Bank(String name ,int account_no)
    {
this.name = name;
this.account_no = account_no;
    }
    void Show()
    {
    	System.out.println("name=" + name + "\t account_no=" + account_no);
    }
    }
public class Overload_constructer {

	public static void main(String[] args) {
		Bank obj1 = new Bank();
		obj1.Show();
		Bank obj2 = new Bank(12);
		obj2.Show();
		Bank obj3 = new Bank("satish",54);
		obj3.Show();
	}

}
