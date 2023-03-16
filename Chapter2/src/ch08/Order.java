package ch08;

public class Order {
	public String orderNumber;
	public String phoneNumber;
	public String orderAddress;
	public String orderDate;
	public String orderTime;
	public int orderPrice;
	public String orderMenu;
	
	public Order() {}
	
	public Order(String phoneNumber,String orderAddress, String orderData, String orderTime, String orderMenu, int orderPrice) {
		this.orderNumber = orderData + orderTime;
		this.phoneNumber = phoneNumber;
		this.orderAddress = orderAddress;
		this.orderDate = orderData;
		this.orderTime = orderTime;
		this.orderPrice = orderPrice;
		this.orderMenu = orderMenu;
	}
	
	public void showOrderList () {
	System.out.println(
		"주문 접수 번호 : " + orderNumber +
		"\n주문 핸드폰 번호 : " + phoneNumber +
		"\n주문 집 주소 : " + orderAddress +
		"\n주문 날짜 : " + orderDate + 
		"\n주문 시간 : " + orderTime +
		"\n주문 메뉴 : " + orderMenu +
		"\n주문 가격 : " + orderPrice
		);
	}
}

