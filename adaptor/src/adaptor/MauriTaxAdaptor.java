package adaptor;

public class MauriTaxAdaptor implements DecathlonTax {
	MauriTax mt= new MauriTax();
	@Override
	public double taxCalc(double amt) {
		// TODO Auto-generated method stub
		return mt.getTax(amt);
	}

}
