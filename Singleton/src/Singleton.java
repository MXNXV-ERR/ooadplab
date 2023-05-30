import java.util.Scanner;

public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Browser obj= Browser.getInstance();
		while(true)
		{
			System.out.println("\n\nMenuuuu\n1.Create Instance\n2.Add url\n3.View History\n4.Exit");
			int ch=sc.nextInt();
			switch (ch) {
			case 1:obj=Browser.getInstance();
				break;
			case 2:System.out.println("Enter url");
				String url=sc.next();
				obj.add(url);
				break;
			case 3:obj.getHistory();
				break;
			case 4:break;
			
			default:
				System.out.println("Whyyyyyyyyy");
			}
		}
	}

}
