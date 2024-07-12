package inheritance;

public class Quiz3 {

	public static void main(String[] args) {

		Pen pen = new Pen();
		Ballpen ball = new Ballpen();
		Fount fount = new Fount();
		ball.quan(2);
		ball.thick("100%");
		ball.color("파랑색");
		ball.showInfo();
		
		fount.quan(3);
		fount.thick("80%");
		fount.brand("몽블랑");
		fount.showInfo();
		
	}

}

// 펜 클래스(부모)
class Pen {
	String thick;
	int quan;
	
	public void thick(String thick) {
		this.thick = thick;
	}
	
	public void quan(int quan) {
		this.quan = quan;
	}
	

	
}

class Ballpen extends Pen {
	String color;
	
	public void color(String color) {
		this.color = color;
	}
	
	public void showInfo() {
		System.out.println("펜의 굵기 : " + thick + " 남은 양 : " + quan + "볼펜의 색 : " + color);
	}
	
}

class Fount extends Pen{
	String brand;
	
	public void brand(String brand) {
		this.brand = brand;
	}
	
	public void showInfo() {
		System.out.println("펜의 굵기 : " + thick + " 남은 양 : " + quan + "브랜드 : " + brand);
	}
	
}
