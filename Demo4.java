package Demo1;

interface Devloper
{
	void devlop();
}
interface Tester
{
	void test();
}
interface Developer extends Tester{
	@Override
	public void test() {
		System.out.println("develop code");
	}
	@Override
	public void devlop() {
		System.out.println("check functionality");
	}
}
public class Demo4 {

	public static void main(String[] args) {
		Manager m=new Manager();
		m.test();
		m.devlop();
		Devloper d=new Manager();
		d.devlop();

	}

}
