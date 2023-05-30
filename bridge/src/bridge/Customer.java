package bridge;

public abstract class Customer {
	Discount d;

	public Customer(Discount d) {
		this.d = d;
	}
	abstract double calc(double price);
}
