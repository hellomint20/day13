package abstract_;

interface Test09{
	public void test();
}
class TestClass09 implements Test09{
	public void test() {
		System.out.println("test 실행");
	}
}

public class MainClass09 {
	public static void main(String[] args) {
		TestClass09 t01 = new TestClass09();
		t01.test();
		System.out.println("================");
		
		Test09 t02 = new Test09() {
			public void test() {	//실체화를 만드는 코드가 꼭 필요함
				System.out.println("interface");
			}
		};
		t02.test();
		System.out.println("================");
		//코드가 훨씬 간결해짐	//해당 인터페이스 메소드가 무조건 '1'개여야만 함
		Test09 t03 = () -> System.out.println("람다가 실행됩니다.");
		t03.test();
	}
}
