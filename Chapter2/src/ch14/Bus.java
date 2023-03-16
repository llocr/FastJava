package ch14;

public class Bus {
	
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
		this.passengerCount = 0;
		this.money = 0;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showBusInfo () {
		System.out.println(busNumber + "번 버의 승객 수는 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
	}
	
}
