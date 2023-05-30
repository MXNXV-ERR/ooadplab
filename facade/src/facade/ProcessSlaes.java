package facade;

import java.util.Scanner;

public class ProcessSlaes {
	boolean cert;
	double amt;
	int qty;
	public ProcessSlaes(boolean cert, double amt, int qty) {
		super();
		this.cert = cert;
		this.amt = amt;
		this.qty = qty;
	}
	void processOrder()
	{
		if(!cert)
			System.out.println("Lukhaa");
		else
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter giftCard value");
			int v=sc.nextInt();
			if(qty<0)
				System.out.println("Nothing");
			if(qty>1)
				System.out.println("OInyl1111111");
			if(amt>v)
				System.out.println("pay"+(amt-v));
			else
				System.out.println("hyeee???");
			
		}
	}
}
