package pack4;
abstract class Anonymous
{
	public abstract void show();
}
public class Inner_class2 {

	public static void main(String[] args) {
		Anonymous obj = new Anonymous()
		{
			public void show()
		{
			System.out.println("Anonymous Inner_class");
		}
		};
		obj.show();
		
	}

	}

