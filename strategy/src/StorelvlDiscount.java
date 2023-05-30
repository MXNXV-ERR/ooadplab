
public class StorelvlDiscount {
	double dis=100;
	double storedis(double price)
	{
		if(price>2000)
			price-=dis;
		return price;
		
	}
}
