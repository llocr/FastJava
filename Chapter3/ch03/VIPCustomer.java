package ch03;

public class VIPCustomer extends Customer {
	
	double salesRatio;
	String agentId;
	
	
//	public VIPCustomer() {
//
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		salesRatio = 0.1;
//		
//		System.out.println("VIPCustomer() Call");
//	}
	
	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) Call");
	}

	public String getAgentId() {
		return agentId;
	}
	
	public String setAgentId() {
		return agentId;
	}
	
	
}
