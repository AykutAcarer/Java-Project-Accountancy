package code.account;

public class SelbstKosten {
	double selbstKosten;
	
	//prime costs
	public double getSelbstKosten(double bezugsKosten, double handlungsKosten) {
	
		double selbstKosten = bezugsKosten+(bezugsKosten/100*handlungsKosten);
		
		return selbstKosten;
	}

}
