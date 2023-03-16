package ch08;

public class OrderTest {

	public static void main(String[] args) {
		
		Order orderChicken = new Order("010-5284-6797" , "인천광역시 오동로 32, 204동 703호", "20230107", "125430", "뿌링클 치킨", 20000);
		
		orderChicken.showOrderList();
	}

}
