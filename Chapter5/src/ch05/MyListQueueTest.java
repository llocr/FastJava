package ch05;

public class MyListQueueTest {

	public static void main(String[] args) {
		
		MyLinkedQueue listQueue = new MyLinkedQueue();
		listQueue.enqueue("a");
		listQueue.enqueue("b");
		listQueue.enqueue("c");
		
		listQueue.printAll();
		
		System.out.println(listQueue.dequeue());
		
		
	}

}
