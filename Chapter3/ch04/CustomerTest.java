package ch04;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(100101, "희수");
		customerLee.bonusPoint = 1000;
		int price = customerLee.calcPrice(1000);
		System.out.println(customerLee.showCustomerInfo() + price);
		
		VIPCustomer customerSon = new VIPCustomer(100102 , "은수");
		customerSon.bonusPoint = 10000;
		price = customerSon.calcPrice(1000);
		System.out.println(customerSon.showCustomerInfo() + price);
		
		Customer vc = new VIPCustomer(12345, "nonmae");
		System.out.println(vc.calcPrice(1000));

	}

}
