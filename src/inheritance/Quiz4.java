package inheritance;

public class Quiz4 {

	public static void main(String[] args) {

		Monster monster = new Monster(); // 몬스터 생성
		monster.attack = 10;
		monster.health = 100;
		monster.showInfo();
		monster.doAttack();
		System.out.println();
		
		Slime slime = new Slime(); // 슬라임 생성
		slime.attack = 30;
		slime.health = 200; // 부모클래스에서 물려받은 속성
		slime.skill = "마비";
		slime.showInfo(); // 부모 클래스
		slime.doAttack(); // 부모 클래스
		
	}

}

class Monster {
	int attack; // 공격력
	int health; // 체력

	public void doAttack() {
		System.out.println("몬스터가 " + attack + "만큼 공격했다!");
	}

	public void showInfo() {
		System.out.println("몬스터의 공격력은 " + attack + "이고 체력은 " + health);
	}
}

// 슬라임 클래스
class Slime extends Monster {
	String skill; // 스킬

	public void doSkill() {
		System.out.println("슬라임이 " + skill + "을 시전했다!");
	}

}