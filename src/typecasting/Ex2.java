package typecasting;

public class Ex2 {

	public static void main(String[] args) {

		VIPCustomer2 vipCustomer2 = new VIPCustomer2("둘리");
		
	}

}


//일반회원 클래스
class Customer2 {
	String customerName; // 회원 이름
	String customerGrade; // 회원 등급
	double bonusPoint; // 보너스 포인트
	double bonusRatio; // 적립률 -> 1:100% / 0.01:1%
	
	// 고정값은 생성자에서 초기화!
	public Customer2(String customerName) {
		this.customerName = customerName;
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
class VIPCustomer2 extends Customer2 {
	
	// extends로 인해 +4 속성 +2 함수
	double saleRatio; // 할인률
	
	// 고정값은 생성자에서 초기화
	public VIPCustomer2(String customerName) {
		super(customerName); // Ex1과는 다르게 default생성자가 아니라
		// 매개변수를 받기때문에 VIPCustomer2에도 매개변수를 받는 (String customerName)을 넣어주고
		// super뒤에도 customerName 매개변수를 넣어주어야함
		customerGrade = "VIP";
		bonusRatio = 0.05; // 5%
		saleRatio = 0.1; // 10%
		
		System.out.println("VIPCustomer() 생성자 호출");
	}
	
}