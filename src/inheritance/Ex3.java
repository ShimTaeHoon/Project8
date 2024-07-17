package inheritance;

public class Ex3 {

	public static void main(String[] args) {

		// 일반회원 생성
		Customer customer = new Customer();
		Customer customer2 = new Customer();
		customer.customerName = "둘리";
		customer2.customerName = "또또";
		customer2.bonusPoint = 1000;
		customer2.calcPrice(2000);
		customer.calcPrice(10000);
		customer.showInfo();
		customer2.showInfo();
		
		// vip회원 생성
		VIPCustomer vip = new VIPCustomer();
		vip.customerName = "또치";
		vip.calcPrice(10000);
		vip.showInfo();
		vip.calcPrice(20000);
		vip.showInfo();
		

	}

}

// 일반회원 클래스
class Customer {
	String customerName; // 회원 이름
	String customerGrade; // 회원 등급
	double bonusPoint; // 보너스 포인트
	double bonusRatio; // 적립률 -> 1:100% / 0.01:1%
	
	// 고정값은 생성자에서 초기화!
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
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

// VIP 회원 클래스
class VIPCustomer extends Customer {
	
	// extends로 인해 +4 속성 +2 함수
	double saleRatio; // 할인률
	double saleprice;
	double lastPrice;
	
	// 고정값은 생성자에서 초기화
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05; // 5%
		saleRatio = 0.1; // 10%
	}
	
	public void calcPrice(int price) {
		saleprice = saleRatio * price;
		lastPrice = price - saleprice;
		bonusPoint = bonusPoint + (price * bonusRatio);
		System.out.println(customerName + "님이"
						+ price + "원의 상품을 할인받아"
						+ lastPrice + "원에 구매했습니다.");
	}
	
	public void showInfo() {
		System.out.println(customerName + "님의 등급은 " 
				+ customerGrade + "이며"
				+ "보너스포인트는" + bonusPoint + "입니다");
	}
}

