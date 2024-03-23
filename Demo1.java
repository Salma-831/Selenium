package Demo1;

abstract class shape
{
	abstract void draw();
	
}
class circle extends shape
{
	@Override
	void draw()
	{
		System.out.println("circle shape");
	}

}

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c=new circle();
		c.draw();

	}

}
