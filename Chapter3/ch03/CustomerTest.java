package ch03;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(100101, "희수");
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerSon = new VIPCustomer(100102 , "은수");
		customerSon.bonusPoint = 10000;
		
		System.out.println(customerSon.showCustomerInfo());
		
		Customer vcdd = new VIPCustomer(12345, "nonmae");
	}

} 
