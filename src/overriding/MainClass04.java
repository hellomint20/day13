package overriding;

class Test04{
	public void test1() {}
	protected void test2() {}
}
class TestClass04 extends Test04{
	public void test1() {}	//부모가 public 이기 때문에 protected 로 바꾸면 오류남
	protected void test2() {}
}
public class MainClass04 {
	public static void main(String[] args) {
		
	}
}
