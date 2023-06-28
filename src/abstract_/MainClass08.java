package abstract_;

import java.util.*;

interface Test08{
	//인터페이스에 변수 만들 때는 값을 초기화해줘야 함
	//인터페이스에 변수 만들면 자동으로 static 과 final이 포함됨 (생략 가능) --> 값 변경 불가능
	public int num = 100;		
	public static final String name = "홍길동";
	public static String name1 = "홍길동";
	public final String name2 = "홍길동";
}

public class MainClass08 implements Test08{
	public static void main(String[] args) {
		List<String> arr = new ArrayList<>();
		Map<String, String> map = new HashMap<>();
		Set<String> set = new HashSet<>();
		//인터페이스(부모) 				자식
		
		System.out.println(Test08.num);
		System.out.println(Test08.name);
		
		//Test08 계속 쓰는거 대신 상속 받아서 작성해줌
		System.out.println(name2);
	}
}
