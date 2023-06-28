package abstract_;

interface A02{}
interface B02{
	public void test();
}
class C02{
	public void test1() {}
}
class Test02 extends C02 implements A02, B02{
	public void test() {}	//상속받으면 무조건 오버라이딩 해줘야 함
}
public class MainClass02 {
	public static void main(String[] args) {
		
	}
}

/*
interface
- 추상화 메소드만 포함할 수 있다
- 변수는 static final 형식으로만 만들어진다.
- 다중 상속이 가능하다
 */