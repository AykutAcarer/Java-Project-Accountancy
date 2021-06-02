package code.account;
/**
 * @author Aykut Acarer
 * 
 */
public class SelbstKosten {
	double selbstKosten;
	
	//prime costs
	public double getSelbstKosten(double bezugsKosten, double handlungsKosten) {
	
		double selbstKosten = bezugsKosten+(bezugsKosten/100*handlungsKosten);
		
		return selbstKosten;
	}

}
