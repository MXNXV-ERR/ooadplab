
public class ObserverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject sub=new FestiveSub();
		Customer c1=new Customer("MXNXv");
		Customer c2=new Customer("err");
		sub.sub(c1);
		sub.sub(c2);
		
		sub.festdic("Diwali",100);
		
		sub.unsub(c1);
		
		sub.festdic("Holi shit",10);
	}

}
