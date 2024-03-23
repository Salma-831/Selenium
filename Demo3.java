package Demo1;

interface Devloper
{
	void devlop();
}
interface Tester
{
	void test();
}
class Manager implements Devloper, Tester
{
	@Override
	public void test() {
		System.out.println("develop code");
	}
	@Override
	public void devlop() {
		System.out.println("check functionality");
	}
}
public class Demo3 {

	public static void main(String[] args) {
		Manager m=new Manager();
		m.test();
		m.devlop();
		Devloper d=new Manager();
		d.devlop();

	}

}
