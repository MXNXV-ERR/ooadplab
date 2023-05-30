package bridge;

public class dis2 implements Discount {

	@Override
	public double calc(double price) {
		// TODO Auto-generated method stub
		System.out.println("20%");
		return price*20;
	}

}
