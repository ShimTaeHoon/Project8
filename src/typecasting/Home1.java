package typecasting;

public class Home1 {

	public static void main(String[] args) {
		
		Parentss pa = new Childd("한국", "고", "길동");
		Childd ch = new Childd("영국", "강", "또치");
		System.out.println(pa.lastName + pa.national);
		System.out.println(ch.firstName + ch.lastName + ch.national);
	}

}

class Parentss {
	String national;
	String lastName;
	
	public Parentss(String national, String lastName) {
		super();
		this.national = national;
		this.lastName = lastName;
	}
	
}

class Childd extends Parentss {
	String firstName;

	public Childd(String national, String lastName, String firstName) {
		super(national, lastName);
		this.firstName = firstName;
	}

}
