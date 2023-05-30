package facade;

public class SportsFacade {
	itemsPurchased i;
	ProcessSlaes p;
	
	public SportsFacade(boolean c,int amt) {
		// TODO Auto-generated constructor stub
		i=new itemsPurchased();
		p=new ProcessSlaes(c, amt, i.getQty());
	}
	void showitems()
	{
		i.diplayitems();
	}
	void processslaes()
	{
		p.processOrder();
	}
}
