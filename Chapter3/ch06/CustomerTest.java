package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerT = new Customer(10010, "Tomas");
		Customer customerJ = new Customer(10011, "Jenny");
		Customer customerK = new GoldCustomer(10012, "Kai");
		Customer customerA = new GoldCustomer(10013, "Amy");
		Customer customerH = new VIPCustomer(10014, "Harry");
		
		customerList.add(customerT);
		customerList.add(customerJ);
		customerList.add(customerK);
		customerList.add(customerA);
		customerList.add(customerH);
		
//		for(Customer customer : customerList) {
//			System.out.println(customer.showCustomerInfo());
//		}
//		
//		int price = 10000;
//		
//		for(Customer customer : customerList) {
//			int cost = customer.calcPrice(price);
//			System.out.println(customer.getCustomerName()  + "님이 " + cost +"원을 지불하셨습니다.");
//			System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는 " + customer.bonusPoint + "입니다.");
//		}
		
		if(customerK instanceof GoldCustomer) {
			GoldCustomer vc = (GoldCustomer)customerK;
			System.out.println(customerK.showCustomerInfo());
		}
	}

}
