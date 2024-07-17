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
		// Animal클래스로(부모클래스)로 자식클래스의 메서드를 사용하기위해?
		for(Animal ani : list) {
			if (ani instanceof Human) {
				// ani를 Human타입으로 변경하고 h참조변수에 주소값을 담아라.
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
