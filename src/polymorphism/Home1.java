package polymorphism;

public class Home1 {

	public static void main(String[] args) {

		runCar(new Bus2());
		runCar(new Sport2());

	}
	
	public static void runCar(Car2 car2) {
		car2.run();
	}

}

class Car2 {
	
	public void run() {
		System.out.println("주행한다");
	}
	
}

class Bus2 extends Car2{
	
	public void run() {
		System.out.println("버스가 달린다");
	}
}

class Sport2 extends Car2{
	
	public void run() {
		System.out.println("스포츠카가 달린다");
	}
}
