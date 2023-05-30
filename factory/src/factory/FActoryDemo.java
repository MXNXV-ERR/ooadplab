package factory;

public class FActoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerFactory cf= new CustomerFactory();
		Customer c1=cf.getCustimer("regular");
		Customer c2=cf.getCustimer("first time");
		
		c1.gettype();
		c2.gettype();
	}

}
