package ch18;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		
		int input;
		int sum = 0;
		
		do {
			System.out.println("숫자를 입력해 주세요 : ");
			input = scanner.nextInt();
			sum += input;
		} while (input != 0);
		
		System.out.println("총합은 " + sum + "입니다.");
	}

}
