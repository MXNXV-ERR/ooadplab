import java.util.ArrayList;

public class FestiveSub extends Subject {
	ArrayList<Customer> customers=new ArrayList<>();
	String currentfest;
	int currdis;
	
	@Override
	void sub(Customer c) {
		// TODO Auto-generated method stub
		customers.add(c);
	}

	@Override
	void unsub(Customer c) {
		// TODO Auto-generated method stub
		customers.remove(c);

	}

	@Override
	void festdic(String f, int d) {
		// TODO Auto-generated method stub
		currdis=d;
		currentfest=f;
		notifyall();
	}
	
	void notifyall()
	{
		for(Customer i:customers)
		{
			i.update(currentfest, currdis);
		}
	}
}
