package ch04;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		
		studentLee.studentId = 2020100539;
		studentLee.setStudentName("Heesue");
		studentLee.address = "인천광역시 오동로 32";
		
		studentLee.showStudentInfo();
		
		Student studentSon = new Student();
		studentSon.studentId = 2019491169;
		studentSon.studentName = "Eunsu";
		studentSon.address = "희수 마음 속 ";
		
		studentSon.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentSon); //heap메모리의 가상주소를 가르킨다  
	}

}
 