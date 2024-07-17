package downcasting;

public class Ex1 {

	public static void main(String[] args) {

		// 형변환
		// Animal클래스의 animal 참조변수에
		// 자식클래스인 Human 인스턴스를 생성하면
		// 제약으로 인해 Human클래스의 readbook 메소드를 사용하지 못함
		// (있긴 있으나 사용은 x)
		// 그러나 아래의 다운캐스팅을 진행하면 사용가능하다.
		Animal animal = new Human();
		
		animal.move();
//		animal.readBook(); // 자식클래스의 readbook 사용불가.
			
		// 1. 실제 인스턴스 타입이 Human인지 확인
		// 앞에는 변수 animal 뒤에는 클래스 Human
		if (animal instanceof Human) {
			
			// 2. 원래 타입으로 변경
			Human human = (Human)animal;
			human.readBook();
			
		}

	}

}

//동물 클래스
class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

// 사람 클래스
class Human extends Animal {

	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");		
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");		
	}
	
}

// 호랑이 클래스
class Tiger extends Animal {

	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() { // 부모클래스에 없는거 추가
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}

// 독수리 클래스
class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다"); // 재정의
	}
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다"); // 추가
	}
}

