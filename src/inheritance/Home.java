package inheritance;

public class Home {

	public static void main(String[] args) {

		Test test = new Test();
		test.money = 1;
		System.out.println(test.money);

	}

}

class Test{
	int money;
	
	
}
