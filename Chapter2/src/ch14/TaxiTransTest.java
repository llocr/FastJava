package ch14;

public class TaxiTransTest {

	public static void main(String[] args) {
		
		Student studentE = new Student("Edward", 20000);
		
		Taxi taxi1 = new Taxi("잘나간다운수");
		
		studentE.takeTaxi(taxi1);
		
		studentE.showInfo();
		taxi1.showTaxiInfo();
	}

}
