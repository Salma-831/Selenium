package Demo1;

interface printable
{
   void input();
	
}
class rectangle implements printable
{
	@Override
	public void input()
	{
		System.out.println("Hello");
	}

}

public class DemoInterface {

	public static void main(String[] args) {
		printable p=new rectangle();
		p.input();

	}

}
