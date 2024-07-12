package inheritance;

public class Ex1 {

	public static void main(String[] args) {

		Child child = new Child();
		
		child.nationality = "한국"; // 부모클래스에서 물려받은 속성
		child.lastName = "고"; // 부모클래스에서 물려받은 속성
		child.firstName = "길동"; // 본인 속성

	}

}

// 부모 클래스
class Parents {
	String nationality; // 국적
	String lastName; // 성
}

// 자식 클래스
class Child extends Parents {
	String firstName; // 이름

//	눈에 보이지 않지만 Parents의 멤버변수를 상속 받아서 가지고 있음.
//	String nationality; // 국적
//	String lastName; // 성
	
}

