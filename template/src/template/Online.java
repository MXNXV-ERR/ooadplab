package template;

public class Online extends Orderprocessing {


	int totalamt = 0;
	 void selectItem()
	{
		System.out.println("welcome to online store");
		System.out.println("Items choosen");
		System.out.println("1 | 400Rs");
		System.out.println("2 | 600Rs");
		System.out.println("3 | 200Rs");
		System.out.println("4 | 300Rs");
		totalamt = 400+600+200+300;
	}
	void dopayment()
	{
		System.out.println("pay via net banking");
	}
	void dodelivery()
	{
		String address = "Rit";
		int shippingcharge = 100;
		System.out.println("shipping charge for address " + address + " is "+ shippingcharge);
		System.out.println("total bill amount " + (totalamt + shippingcharge));
		System.out.println("thank you for shopping with us");
	}


}
