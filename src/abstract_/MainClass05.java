package abstract_;

class A지상군05 implements Army{
	public void 총알장전() {
		System.out.println("총알 장전");
	}
	public void 방패설치() {
		System.out.println("방패 설치");
	}
	public void attack() {
		총알장전();
		System.out.println("지상군 공격");
	}
	public void defense() {
		방패설치();
		System.out.println("지상군 방어");
	}
}

public class MainClass05 {
	public static void main(String[] args) {
		Army a = new A지상군05();	//upcasting 함 --> 부모 코드만 보임
		a.attack(); a.defense();	
	}
}
