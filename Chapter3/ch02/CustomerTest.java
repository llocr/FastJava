package ch02;

public class CustomerTest {

	public static void main(String[] args) {
		
//		Customer customerLee = new Customer();
//		customerLee.setCustomerName("이희수");
//		customerLee.setCustomerId(10000);
//		customerLee.bonusPoint = 1000;
//		
//		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerName("김유신");
		customerKim.setCustomerId(100001);
		customerKim.bonusPoint = 10000;
		
		System.out.println(customerKim.showCustomerInfo());
	}

}
