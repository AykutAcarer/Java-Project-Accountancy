package code.account;

public class BezugsKosten extends Eingabe{

	double bezugsPreis;

	//purchase cost
	public double getBezugsPreis(double einkaufsPreis, double skonto, double fracht) {
		
		bezugsPreis=einkaufsPreis-(einkaufsPreis/100*skonto)+fracht;
		
		return bezugsPreis;
	}
	

	
}
