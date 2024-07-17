package polymorphism;

public class Ex3 {

	public static void main(String[] args) {
		
//		Animal animal = new Human();
//		animal.move();
		moveAnimal(new Human()); // Animal animal = new Human() 
		moveAnimal(new Tiger()); // Animal animal = new Tiger()
		moveAnimal(new Eagle()); // Animal animal = new Eagle()

	}
	
	// 메소드 사용할때 인스턴스없이 사용하고싶을때 // 메인에서 바로 사용가능
	// 스태틱이 없으면 instance가 있어야 쓸수있음.
	// 메인 메소드에 선언해야함!!
	public static void moveAnimal(Animal animal) {
		animal.move(); // 재정의된 메소드가 호출됨
	}

}
