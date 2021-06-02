package code.account;
/**
 * @author Aykut Acarer
 * 
 */
import java.util.Scanner;

public  class Start {
	
	// Creat an object
	static Eingabe p1 = new Eingabe();
	static double bPreis, skosten, nPreis, vPreis;
	
	//Calculation
	public static void ausgabe() {
		
		// to creat an objekt to access the Class "Bezugskosten" in order to calculate purchase costs 
		BezugsKosten b1 = new BezugsKosten();
		bPreis = b1.getBezugsPreis(p1.einkaufsPreis,p1.skonto,p1.fracht);
		
		
		//to creat an objekt to access the Class "SelbstKosten" in order to calculate prime costs
		SelbstKosten s1 = new SelbstKosten();									
		skosten=s1.getSelbstKosten(bPreis, p1.handlungsKosten);
	   
		
		//to creat an objekt to access the Class "NettoPreis" in order to calculate net price
		NettoPreis n1 = new NettoPreis();
		nPreis = n1.getNettoPreis(skosten, p1.gewinn);									
		
		//to creat an objekt to access the Class "VerkaufsPreis" in order to calculate Selling price
		VerkaufsPreis v1 = new VerkaufsPreis();
		vPreis= v1.getVerkaufsPreis(nPreis, p1.mwst);
		
		// to access Database and write the Prices on database
		p1.datenbank2();
		
		// to write the costs and prices on Console
		System.out.println("Bezugspreis = "+bPreis+"\nSelbstkosten= "+skosten+"\nNettopreis= "+nPreis+"\nVerkaufspreis= "+vPreis);
	
	}
	
		public static void main(String[] args) {
			
			//To access Database and read the data from Database
			p1.datenbank1();
			
	
			
			
		
			
		
		
		
		
		
		
		
									
		
		
								
		
		
			
			
			
			
			
		}
	
	}
	
	
	

	
	
	

