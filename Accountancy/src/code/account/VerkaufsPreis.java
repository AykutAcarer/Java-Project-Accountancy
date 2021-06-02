package code.account;
/**
 * @author Aykut Acarer
 * 
 */
public class VerkaufsPreis {
	
	double verkaufsPreis;
	//Selling price
	public double getVerkaufsPreis(double nettoPreis, double mwst) {
		
		double verkaufsPreis = nettoPreis+(nettoPreis/100*mwst);
		
		return verkaufsPreis;
	}

}
