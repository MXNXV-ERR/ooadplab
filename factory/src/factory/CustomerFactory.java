package factory;

public class CustomerFactory {
	Customer getCustimer(String type)
	{
		if(type.equalsIgnoreCase("first time"))
			return new Firsttime();
		else if(type.equalsIgnoreCase("senoir"))
			return new Senoir();
		else if(type.equalsIgnoreCase("regular"))
			return new Regular();
		
		return null;
	}
}
