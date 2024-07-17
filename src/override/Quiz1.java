package override;

public class Quiz1 {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		cat.eat();
		cat.sound();
		dog.eat();
		dog.sound();

	}

}

class Animal {
	
	public void eat() {
		System.out.println("먹는다");
	}
	
	public void sound() {
		System.out.println("짖는다");
	}
}

class Cat extends Animal {
	
	public void eat() {
		System.out.println("고양이는 쥐를 먹는다");
	}
	
	public void sound() {
		System.out.println("고양이는 야옹하고 짖는다");
	}
}

class Dog extends Animal {
	
	public void eat() {
		System.out.println("개는 고기를 먹는다");
	}
	
	public void sound() {
		System.out.println("개는 멍멍하고 짖는다");
	}
	
}
