package bridge;

public class Regular extends Customer {

	public Regular(Discount d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	double calc(double price) {
		// TODO Auto-generated method stub
		System.out.println(getClass().toString());
		return d.calc(price);
	}

}
