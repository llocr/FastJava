package ch19;

public class Car {
	
	private static int sirealNum = 10000;
	int carNum;
	
	public Car() {
		sirealNum++;
		carNum = sirealNum;
	}

	public int getCarNum() {
		return carNum;
	}
	
}
