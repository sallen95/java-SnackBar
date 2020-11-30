package snackbarapp;

public class Main {
	private static void workWithData() {

		Customer jane = new Customer("Jane", 45.25);
		Customer bob = new Customer("Bob", 33.14);

		VendingMachine food = new VendingMachine("Food");
		VendingMachine drink = new VendingMachine("Drink");
		VendingMachine office = new VendingMachine("Office");

		// String name, int quantity, double cost, int vendingMachineId
		Snack chips = new Snack("Chips", 36, 1.75, food.getId());
		Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.getId());
		Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());

		Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
		Snack water = new Snack("Water", 20, 2.75, drink.getId());

		jane.buySnack(3 * soda.getCost());
		System.out.println(jane.getName() + " cash on hand $" + jane.getCash());
		soda.removeQuantity(3);
		System.out.println("Quantity of " + soda.getName() + " is " + soda.getQuantity());
		System.out.println();

		jane.buySnack(pretzel.getCost());
		System.out.println(jane.getName() + " cash on hand $" + jane.getCash());
		pretzel.removeQuantity(1);
		System.out.println("Quantity of " + pretzel.getName() + " is " + pretzel.getQuantity());
		System.out.println();

		bob.buySnack(2 * soda.getCost());
		System.out.println(bob.getName() + " cash on hand $" + bob.getCash());
		soda.removeQuantity(2);
		System.out.println("Quantity of " + soda.getName() + " is " + soda.getQuantity());
		System.out.println();

		jane.addCash(10);
		System.out.println(jane.getName() + " cash on hand $" + jane.getCash());
		System.out.println();

		jane.buySnack(chocolateBar.getCost());
		chocolateBar.removeQuantity(1);
		System.out.println(jane.getName() + " cash on hand $" + jane.getCash());
		System.out.println("Quantity of " + chocolateBar.getName() + " is " + chocolateBar.getQuantity());
		System.out.println();

		pretzel.addQuantity(12);
		System.out.println("Quantity of " + pretzel.getName() + " is " + pretzel.getQuantity());
		System.out.println();

		bob.buySnack(3 * pretzel.getCost());
		pretzel.removeQuantity(3);
		System.out.println(bob.getName() + " cash on hand $" + bob.getCash());
		System.out.println("Quantity of " + pretzel.getName() + " is " + pretzel.getQuantity());
		
	}

	public static void main(String[] args) {
		workWithData();
	}
}