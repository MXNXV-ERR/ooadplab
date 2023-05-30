import java.util.ArrayList;

public class Browser {
	private static Browser instance;
	ArrayList<String> history=new ArrayList<>();
	private Browser() {
		super();
	}
	static Browser getInstance()
	{
		if(instance==null)
			instance =new Browser();
		else
			System.out.println("Already exists");
		return instance;
	}
	void add(String url)
	{
		history.add(url);
	}
	void getHistory()
	{
		for(String u:history)
		{
			System.out.println(u);
		}
	}
}
