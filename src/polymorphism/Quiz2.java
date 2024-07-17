package polymorphism;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {
		
		ArrayList<Customer> list = new ArrayList<Customer>();
		
		Customer customer1 = new Customer("일반");
		Customer customer2 = new GoldCustomer("GOLD");
		Customer customer3 = new VIPCustomer("VIP");

		list.add(customer1);
		list.add(customer2);
		list.add(customer3);
		
		for(Customer customer : list) {
			customer.calcPrice(10000);
			customer.showInfo();
		}
		
	}

}

class Gold extends Customer {
	
	double saleRatio;
	
	public Gold(String customerName) {
		super(customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	// 재정의한 메소드
	public void calPrice(int price) {

		bonusPoint = bonusPoint + (price * bonusRatio);
		int salePrice = price - (int)(price * saleRatio);
		System.out.println(customerName + "님이 " + salePrice
												+"원을 결제했습니다.");
	
	}
}
