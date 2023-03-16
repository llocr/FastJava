package ch14;

public class Taxi {
	
	String companyName;
	int money;

	public Taxi(String companyName) {
		this.companyName = companyName;
		this.money = 0;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showTaxiInfo() {
		System.out.println(companyName + " 택시의 현재 수입은 " + money + "원 입니다.");
	}
}
