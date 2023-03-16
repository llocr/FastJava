package ch08;

public class Person {
	String name;
	String sex;
	int age;
	double height;
	double weight;
	
	public void showPersonInfo() {
		System.out.println("이름 : " + name + "\n성별 : " + sex + "\n나이 : " + age );
	}
	
	public Person () {}
	
	public Person(String name, String sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
}
