package typecasting;

public class Quiz1 {

	public static void main(String[] args) {

		// 부모타입 변수 선언 = 자식클래스 인스턴스 생성
		Parents pc = new Child("한국", "고", "길동");
		// pc. // 국적과 성만 사용가능
				
		Child child = new Child("한국", "고", "길동");
		// child. // 자식클래스에 있는것도 사용가능
	}

}

class Parents {
	String nationality;
	String lastName;
	
	// 국적과 성을 입력받아 인스턴스를 생성하는 생성자
	public Parents(String nationality, String lastName) {
		super();
		this.nationality = nationality;
		this.lastName = lastName;
	}
}

class Child extends Parents {
	String firstName; // 이름
	
	// 국적, 성, 이름을 입력받아 인스턴스를 생성하는
	public Child(String nationality, String lastName, String firstName) {
		super(nationality, lastName);
		this.firstName = firstName;
	}
	
}
