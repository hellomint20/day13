package overriding;
class Test{
	public void test(){}
}
class TestClass05{}

public class MainClass05 {
	public static void main(String[] args) {
		TestClass05 t = new TestClass05();
		System.out.println("aaa".getClass());	
		System.out.println(t.getClass());		//자료형을 알려줌
		System.out.println(t);
		System.out.println(t.toString());		//객체에 대한 정보
	}
}
