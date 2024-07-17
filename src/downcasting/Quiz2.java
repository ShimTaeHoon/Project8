package downcasting;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {

		ArrayList<Person> list = new ArrayList<Person>();
		
		list.add(new Student("둘리"));
		list.add(new Employee("또치"));
		
		for(Person person : list) {
			person.eat(); // 부모가 물려준 eat메소드 호출
			
			if(person instanceof Student) {
				Student s = (Student) person;
				s.study();
			} else if (person instanceof Employee) {
				Employee employee = (Employee) person;
				employee.work();
			}
			
		}
		
	}

}

class Person {
	String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println(name + "밥을 먹는다");
	}
}

class Student extends Person {
	
	public Student(String name) {
		super(name);
	}

	public void study() {
		System.out.println(name + "공부를 한다");
	}
}

class Employee extends Person {
	
	public Employee(String name) {
		super(name);
	}

	public void work() {
		System.out.println(name + "일을 한다");
	}
}

