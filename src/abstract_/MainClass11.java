package abstract_;

interface Test11{	//자바에서 제공해주는 기능
	public void test();
}
class TestClass11{	//자바에서 제공해주는 기능
	public void testClass(Test11 t) {	//인터페이스로 받는 경우
		System.out.println("기능 실행 합니다.");
		t.test();
	}
}
public class MainClass11 {
	public static void main(String[] args) {
		TestClass11 t = new TestClass11();
		
		Test11 tt = new Test11() {
			public void test() {
				System.out.println("test");
			}
		};
		t.testClass(tt);	//인터페이스 객체를 만들어서 전달해줘야 함
		//위에 것을 아래처럼 표현 가능
		t.testClass(()->{System.out.println("aaaa");});
	}
}
