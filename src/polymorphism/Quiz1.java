package polymorphism;

public class Quiz1 {

	public static void main(String[] args) {
		
		runCar(new Bus());
		runCar(new SportsCar());

	}
	
	public static void runCar(Car car) {
		car.run();
	}

}

class Car {
	public void run() {
		System.out.println("주행한다");
	}
}

class Bus extends Car {
	public void run() {
		System.out.println("버스가 달린다");
	}
}

class SportsCar extends Car {
	public void run() {
		System.out.println("스포츠카가 달린다");
	}
}
