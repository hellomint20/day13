package overriding;

final class Test03{		//상속하지 말라는 의미 --> new 연산을 이용해서 써라
	public void test() {
		System.out.println("부모의 기능");
	}
}

class TestClass03{
	public void test() {
		Test03 t = new Test03();
		t.test(); 	//overriding이 아니기 때문에 기능 변경 불가능
		System.out.println("자식의 기능 실행");
	}
}

public class MainClass03 {
	public static void main(String[] args) {
		TestClass03 t = new TestClass03();
		t.test();
	}
}
