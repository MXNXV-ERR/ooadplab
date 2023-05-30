package facade;

public class FacadeDemo {
	public static void main(String[] args) {
		SportsFacade sf=new SportsFacade(true, 100);
		sf.showitems();
		sf.processslaes();
	}
}
