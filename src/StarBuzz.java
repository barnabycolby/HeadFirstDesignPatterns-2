public class StarBuzz {
	public static void main(String[] args) {
		// Create an espresso object and print it's cost
		Beverage espresso = new Espresso();
		System.out.println("An " + espresso.getDescription() + " costs $" + espresso.cost());

		// Create a house blend object and print it's cost
		Beverage houseBlend = new HouseBlend();
		System.out.println("A " + houseBlend.getDescription() + " costs $" + houseBlend.cost());

		// Add some mocha to the espresso and print it's cost
		Beverage espressoWithMocha = new Mocha(espresso);
		System.out.println("A " + espressoWithMocha.getDescription() + " costs $" + espressoWithMocha.cost());

		return;
	}
}
