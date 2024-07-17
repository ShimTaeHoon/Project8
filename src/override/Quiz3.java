package override;

public class Quiz3 {

	public static void main(String[] args) {
		
		Computer computer1 = new Computer();
		computer1.on();
		computer1.off();
		Computer computer2 = new NoteBook();
		computer2.on();
		computer2.off();
		Computer computer3 = new DeskTop();
		computer3.on();
		computer3.off();

	}

}

class Computer {
	
	public void on() {
		System.out.println("컴퓨터를 켭니다");
	}
	public void off() {
		System.out.println("컴퓨터를 끕니다");
	}
}

class NoteBook extends Computer {
	
	public void on() {
		System.out.println("노트북을 켭니다");
	}
	public void off() {
		System.out.println("노트북을 끕니다");
	}
}

class DeskTop extends Computer{
	
	public void on() {
		System.out.println("데스크톱을 켭니다");
	}
	
	public void off() {
		System.out.println("데스크톱을 끕니다");
	}
}
