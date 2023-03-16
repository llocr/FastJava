package ch19;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Coffee etiopiaCoffee = new EtiopiaAmericano();
		etiopiaCoffee.brewing();
		
		System.out.println();
		
		Coffee etiopiaLattee = new Latte(etiopiaCoffee);
		etiopiaLattee.brewing();
		
		System.out.println();
		
		Coffee mocahEtiopia = new Mocha(new Latte(new EtiopiaAmericano()));
		mocahEtiopia.brewing();
		
		Coffee keyaCoffee = new WhippingCream (new Mocha (new Latte (new KeyaAmericano())));
		
		
	}

}
