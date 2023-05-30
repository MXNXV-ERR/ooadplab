package template;

public abstract class Orderprocessing {
	public void processorder() {
		// TODO Auto-generated constructor stub
		selectItem();
		dopayment();
		dodelivery();
	}

	abstract void dodelivery();

	abstract void dopayment();

	abstract void selectItem();
	
}
