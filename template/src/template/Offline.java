package template;
import java.util.Scanner;
public class Offline extends Orderprocessing {


	int totalamt = 0;
	
	Scanner sc = new Scanner(System.in);
	void selectItem()
	{
		System.out.println("welcome to offline store");
		System.out.println("select items ");
		System.out.println("1 | 400Rs");
		System.out.println("2 | 600Rs");
		System.out.println("3 | 200Rs");
		System.out.println("4 | 300Rs");
		System.out.println("Items choosen");
		System.out.println("2 | 600Rs");
		System.out.println("3 | 200Rs");
		totalamt = 600+200;
	}
	void dopayment()
	{
		System.out.println("pay bill through\n1.cash\n2.swipe-card");
	}
	void dodelivery()
	{
		System.out.println("total bill amount " + totalamt);
		System.out.println("You can collect your item at counter 1\nThank you for shopping with us");
	}

}
