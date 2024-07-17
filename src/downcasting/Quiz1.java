package downcasting;

import java.util.ArrayList;

public class Quiz1 {

	public static void main(String[] args) {

		ArrayList<Animal> list = new ArrayList<Animal>();
		
		Animal human1 = new Human();
		Animal tiger1 = new Tiger();
		Animal eagle1 = new Eagle();
		
		if (human1 instanceof Human) {
			
			Human human = (Human)human1;
			human.readBook();
			
		}
		
		if (tiger1 instanceof Tiger) {
			
			Tiger tiger = (Tiger)tiger1;
			tiger.hunting();
		}
		
		if (eagle1 instanceof Eagle) {
			
			Eagle eagle = (Eagle)eagle1;
			eagle.flying();
		}
		
		for(Animal human : list) {
			human1.move();
			tiger1.move();
			eagle1.move();
		}
		
	}

}
