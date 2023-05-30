package facade;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class itemsPurchased {
	HashMap<String, Integer> items;
	int qty;
	public itemsPurchased() {
		// TODO Auto-generated constructor stub
		items=new HashMap<>();
		storepurchase();
	}
	public void storepurchase() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of items");
		int n=sc.nextInt();
		while(n-->0)
		{
			String name = sc.next();
			Integer q=sc.nextInt();
		}
	}
	void diplayitems()
	{
		for(Map.Entry<String,Integer> i:items.entrySet())
		{
			System.out.println(i.getKey()+":"+i.getValue());
		}
	}
	public int getQty() {
		return qty;
	}
}
