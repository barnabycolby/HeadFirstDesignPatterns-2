public class StarBuzz {
	public static void main(String[] args) {
		// Create an espresso object and print it's cost
		Beverage espresso = new Espresso();

		System.out.println("An " + espresso.getDescription() + " costs $" + espresso.cost());

		return;
	}
}
