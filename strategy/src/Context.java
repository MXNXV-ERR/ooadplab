
public class Context {
	PricingStrategy p;
	StorelvlDiscount sd= new StorelvlDiscount();
	
	public Context(PricingStrategy p) {
		super();
		this.p = p;
	}

	void calc(double price)
	{
		
		double dis= sd.storedis(price);
		double tot= p.calc(price);
		System.out.println("Tot final="+(dis-tot));
	}
	
	
}
