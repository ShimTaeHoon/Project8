package inheritance;

public class Home2 {

	public static void main(String[] args) {
		
		Monster2 monster = new Monster2(10, 100);
		monster.showInfo();
		monster.doAttack();
		
		Slime2 slime = new Slime2(30,200,"마비");
		slime.showInfo();
		slime.doAttack();
		slime.doSkill();

	}

}

class Monster2 {
	int attack;
	int health;
	
	public Monster2(int attack, int health) {
		this.attack = attack;
		this.health = health;
	}
	
	public void doAttack() {
		
		System.out.println("몬스터가 " + attack + "만큼 공격했다!");
		
	}
	
	public void showInfo() {
		
		System.out.println("몬스터의 공격력은" + attack + "이고 "
				+ "체력은 " + health + "이다");
		
	}
}

class Slime2 extends Monster2 {

	String skill;
	
	public Slime2(int attack, int health, String skill) {
		super(attack, health);
		this.skill = skill;
	}
	
	public void doSkill() {
		System.out.println("슬라임이 " + skill + "을 시전했다!");
	}
}