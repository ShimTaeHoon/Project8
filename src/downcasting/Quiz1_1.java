package downcasting;

import java.util.ArrayList;

public class Quiz1_1 {

	public static void main(String[] args) {
		
		ArrayList<Animal> list = new ArrayList<Animal>();
		// 1번
		Human human = new Human();
		list.add(human);
		// 2번
		list.add(new Tiger());
		list.add(new Eagle());
		
		// 1번방식
		for(Animal ani : list) {
			if (ani instanceof Human) {
				Human h = (Human) ani;
				h.readBook();
			} else if (ani instanceof Tiger) {
				Tiger t = (Tiger) ani;
				t.hunting();
			} else if (ani instanceof Eagle) {
				Eagle e = (Eagle) ani;
				e.flying();
			}
		}
		// 2번방식
		for(int i = 0; i < list.size(); i++) {
			
			Animal ani = list.get(i);
			
			if(ani instanceof Human) {
				Human h = (Human)ani;
				h.readBook();
			}
		}

	}

}
