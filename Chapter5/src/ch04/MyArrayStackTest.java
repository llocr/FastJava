package ch04;

public class MyArrayStackTest {

	public static void main(String[] args) {
		
		MyArrayStack stack = new MyArrayStack(3);
		
		stack.push(19);
		stack.push(29);
		stack.push(39);
		stack.push(49);
		
		stack.printAll();
	
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
	}

}
