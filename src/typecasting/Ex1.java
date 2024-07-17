package typecasting;

public class Ex1 {

	public static void main(String[] args) {

		VIPCustomer vipCustomer = new VIPCustomer();


	}

}


//일반회원 클래스
class Customer {
	String customerName; // 회원 이름
	String customerGrade; // 회원 등급
	double bonusPoint; // 보너스 포인트
	double bonusRatio; // 적립률 -> 1:100% / 0.01:1%
	
	// 고정값은 생성자에서 초기화!
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer() 생성자 호출");
	}
	
	// 보너스 포인트 적립하고, 지불 가격을 계산하는 메소드
						   // 가격(10000)
	public void calcPrice(int price) {
		
					 // 원본값	// 10000 * 0.01
		bonusPoint = bonusPoint + (price * bonusRatio); 
		System.out.println(customerName+"님이 "
									+ price + "원을 결제했습니다.");
		
	}
	
	public void showInfo() {
		System.out.println(customerName + " 님의 등급은 "
						+ customerGrade + "이며, 보너스포인트는 "
						+ bonusPoint + "입니다.");
	}
	
}

//VIP 회원 클래스
class VIPCustomer extends Customer {
	
	// extends로 인해 +4 속성 +2 함수
	double saleRatio; // 할인률
	
	// 고정값은 생성자에서 초기화
	public VIPCustomer() {
		super(); // 생략 가능. (자동으로 이 코드가 없어도 이 부분이 넣어지는것)
		// super를 ctrl + 클릭하면 부모클래스의 생성자 부분으로 가는게 확인됨
		// 이후 물려받은 속성들이 초기화 되는것.
		// print해보면 customer() < 부모가 먼저 출력 됨
		customerGrade = "VIP";
		bonusRatio = 0.05; // 5%
		saleRatio = 0.1; // 10%
		
		System.out.println("VIPCustomer() 생성자 호출");
	}
}

