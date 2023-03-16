package ch02;

public class VIPCustomer extends Customer {
	
	double salesRatio;
	String agentId;
	
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	public String getAgentId() {
		return agentId;
	}
	
	public String setAgentId() {
		return agentId;
	}
	
	
}
