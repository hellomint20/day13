package overriding;

import java.util.ArrayList;

class TestClass02 extends ArrayList<String>{
	public void test() {
		System.out.println("추가 기능");
	}

	public boolean add(String e) {
		System.out.println("내용을 추가해주는 기능 실행");
		System.out.println("잘 동작 되나요?");
		return super.add(e);
	}
}

public class MainClass02 {
	public static void main(String[] args) {
		TestClass02 t = new TestClass02();
		t.add("안녕하세요");
		System.out.println(t.get(0));
		t.test();
	}
}
