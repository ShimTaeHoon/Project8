package inheritance;

public class Quiz1 {

	public static void main(String[] args) {

		Animal animal = new Animal();
		Animal animal2 = new Animal();
		animal.leg = 1;
		
		System.out.println(animal.leg);
		Tiger tiger = new Tiger();
		Eagle eagle = new Eagle();
		tiger.getLeg(4);
		tiger.getTail(1);
		eagle.getLeg(2);
		eagle.getLeg(2);
		
		tiger.legInfo();
		tiger.tailInfo();
		
		tiger.leg = 4;
		tiger.tail = 1;

	}

}

//동물을 정의하는 클래스를 만드세요.
class Animal {
	int leg;

	public void getLeg(int leg) {
		this.leg = leg;
	}
	
	public void legInfo() {
		System.out.println("다리 : " + leg + "개");
	}
	
}

class Tiger extends Animal {
	int tail;

	public void getTail(int tail) {
		this.tail = tail;
	}
	
	public void tailInfo() {
		System.out.println("꼬리 : " + tail + "개");
	}

}

class Eagle extends Animal {
	int wing;

	public void getWing(int wing) {
		this.wing = wing;
	}
	
	public void wingInfo() {
		System.out.println("날개 : " + wing + "개");
	}
}