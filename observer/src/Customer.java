
public class Customer implements Observer {

	String name;
	
	public Customer(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update(String festival, int dis) {
		// TODO Auto-generated method stub
		System.out.println(name+",For "+festival+"u ill get"+dis+"Discount");
	}

}
