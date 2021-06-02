package code.account;
/**
 * @author Aykut Acarer
 * 
 */
public class NettoPreis{
	
	double nettoPreis;
	
	//net price
	public double getNettoPreis(double selbstPreis, double gewinn) {
		
		double nettoPreis = selbstPreis + (selbstPreis/100*gewinn);
		
		return nettoPreis;
	}


}
