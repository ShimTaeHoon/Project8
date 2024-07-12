package inheritance;

public class Quiz2 {

	public static void main(String[] args) {

		BasicTV basic = new BasicTV();
		basic.powerSt = "on";
		basic.channel = 7;
		basic.volume = 20;

		SmartTV smart = new SmartTV();
		smart.powerSt = "on";
		smart.channel = 11;
		smart.volume = 30;
		smart.ip = "192.168.0.111";

		basic.showInfo();
		smart.showInfo();

	}

}

// 베이직티비를 정의하는 클래스를 만드세요.
class BasicTV {
	String powerSt;
	int channel;
	int volume;

	public void showInfo() {
		System.out.println("전원 : " + powerSt + " 채널 : " + channel + " 볼륨 : " + volume);
	}

}

// 베이직티비를 클래스를 상속받는 스마트티비 클래스를 만드세요
class SmartTV extends BasicTV {
	String ip;

	public void showInfo() {
		System.out.println("전원 : " + powerSt + " 채널 : " + channel + " 볼륨 : " + volume + " 아이피 : " + ip);
	}
}
