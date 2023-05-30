
public class StrategyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PricingStrategy r=new Regular();
		PricingStrategy s= new Senior();
		
		Context c=new Context(r);
		Context c1=new Context(s);
		
		c.calc(200);
		c.calc(300);
		
	}

}
