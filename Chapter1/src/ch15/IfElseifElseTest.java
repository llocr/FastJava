package ch15;

import java.util.Scanner;

public class IfElseifElseTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요 : ");
		int age = scan.nextInt();
		int charge;
		
		if (age < 8) {
			charge = 1000;
			System.out.println("미취학 아동입니다.");
		} else if (age < 14) {
			charge = 2000;
			System.out.println("초등학생 입니다.");
		} else if (age < 20) {
			charge = 2500;
			System.out.println("중고등학생 입니다.");
		} else {
			charge = 3000;
			System.out.println("성인 입니다.");
		}
		
		System.out.println("입장료는 " + charge + "원 입니다.");
		
	}

}
