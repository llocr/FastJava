package ch08;

public class PersonTest {

	public static void main(String[] args) {
		
		Person person1 = new Person("Thomas", "male", 37);
		person1.height = 180;
		person1.weight = 78;
		
		person1.showPersonInfo();
	}

}
