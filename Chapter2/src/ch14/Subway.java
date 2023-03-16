package ch14;

public class Subway {
	
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
		this.passengerCount = 0;
		this.money = 0;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println(lineNumber + "호선 지하철의 승객 수는 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
	}

}
