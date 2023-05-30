package adaptor;

public class AdaptorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MauriTaxAdaptor mta=new MauriTaxAdaptor();
		double res= mta.taxCalc(200);
		System.out.println("Final Taxxx"+res);
	}

}
