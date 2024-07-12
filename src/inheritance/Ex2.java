package inheritance;

public class Ex2 {

	public static void main(String[] args) {

		Student student = new Student();
		student.eat(); // 부모클래스에서 물려받은 기능 (내 것 처럼 사용 가능)
		student.sound(); // 부모클래스에서 물려받은 기능
		student.study(); // 자식
		
		Professor professor = new Professor();
		professor.eat();
		professor.sound();
		professor.work(); // 자식

	}

}

// 사람 클래스
// 자식을 갖는데 제한이 없음.
class Person {
	
	public void sound() {
		System.out.println("대화를 한다");
	}
	
	public void eat() {
		System.out.println("밥을 먹는다");
	}
}

// 학생 클래스
// extends로 인해 Person의 메소드 두개를 상속 받아서
// Student 클래스는 3개의 메소드를 가지게 됨
class Student extends Person{
	
	public void study() {
		System.out.println("공부를 한다");
	}
}

// 교수 클래스
class Professor extends Person {
	
	public void work() {
		System.out.println("일을 한다");
	}
	
}