package Demo1;

public class DemoException {

	public static void main(String[] args) throws InterruptedException {
		int a=0, b=12, c;
		try
		{
			c=b/a;
			System.out.println("division="+c);
		}
		catch(Exception e)
		{
			System.out.println("number is not divisible by zero");
		}
		Thread.sleep(2000);
		System.out.println("Hello");

	}

}
