package code.account;
/**
 * @author Aykut Acarer
 * 
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Eingabe{

	double einkaufsPreis;
	double skonto;
	double fracht;
	double gewinn;
	double mwst;
	double handlungsKosten;
	int id;
	
	// to read the data accessing Database with function "datenbank1"
	public void datenbank1 () {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			// to connected wit database
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/YOUR_DATABASE_NAME","SERVERNAME","PASSWORD");
			
			//to move forward and backward direction
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			
			//ResultSet Interface
			ResultSet rs = stmt.executeQuery("select * from preislist1_eingabe");
	
			while(rs.next()) {
					
					einkaufsPreis = rs.getDouble(2);
					skonto=rs.getDouble(3);
					fracht = rs.getDouble(4);
					gewinn = rs.getDouble(5);
					mwst = rs.getDouble(6);
					handlungsKosten = rs.getDouble(7);
					
					//to calculate every costs and price called the function "ausgabe"
					Start.ausgabe();
	
			}
			con.close();
		}catch(Exception e) {
			System.out.println("Fehler-konnte Daten nicht einlesen");
		}
	}
	 // to write costs and price on database called the function "datenbank2"
	public  void datenbank2() {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kalkulation","root","1234");
			
			//Insert Into
			PreparedStatement ps = con.prepareStatement("insert into preislist2_ausgabe values(?,?,?,?,?)");
			
				ps.setInt(1, id);
				ps.setDouble(2, Start.bPreis);
				ps.setDouble(3, Start.skosten);
				ps.setDouble(4, Start.nPreis);
				ps.setDouble(5, Start.vPreis);
				
				ps.addBatch();
				
			
			ps.executeBatch();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	

	
}
