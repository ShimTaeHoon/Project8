package typecasting;

public class Ex3 {

	public static void main(String[] args) {

		// class 형변환
		// 부모타입 변수 = 자식 인스턴스 생성
		Customer2 vc = new VIPCustomer2("둘리");
		// 실제로는 VIPCustomer2의 bonusRatio가 있지만 Customer2타입의 변수 vc는
		// bonusRatio를 사용할 수 없는 제약사항이 있다
		// vc변수는 Customer클래스가 물려준 멤버변수와 메소드만 사용 할 수 있음 (할인률X)	

	}

}