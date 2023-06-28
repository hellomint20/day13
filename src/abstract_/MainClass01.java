package abstract_;

abstract class TestClass01{		//추상화
	public abstract void function();
	public void test() {
		System.out.println("test 기능");
	}
}
class Test01 extends TestClass01{
	public void test01() {
		System.out.println("새로운 기능");
	}
	public void function() {
		System.out.println("aaaa");
	}
}

public class MainClass01 {
	public static void main(String[] args) {
		Test01 t = new Test01();
	}
}
