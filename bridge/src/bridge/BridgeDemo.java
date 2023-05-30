package bridge;

public class BridgeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1= new Regular(new dis1());
		
		c1.calc(100);
		
		Customer c2 =new Firsttime(new dis2());
		
		c2.calc(200);
	}

}
