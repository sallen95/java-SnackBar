package snackbarapp;

public class Customer {
	private static int maxId = 0;

	private int id;
	private String name;
	private double cash;
	private double cost;

	public Customer(String name, double cash) {
		maxId++;
		id = maxId;

		this.name = name;
		this.cash = cash;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName() {
		this.name = name;
	}

	public double getCash() {
		return cash;
	}

	public void addCash(double cash) {
		this.cash = this.cash + cash;
	}  

	public void buySnack(double cost) {
		this.cash = this.cash - cost;
	}
}