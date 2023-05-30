package bridge;

public class Firsttime extends Customer {

	public Firsttime(Discount d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	@Override
	double calc(double price) {
		// TODO Auto-generated method stub
		System.out.println(getClass().toString());
		return d.calc(price);
	}

}
