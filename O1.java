package oblig1;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Math.*;


public class O1 {
	public static void main(String[] args) {
		// Skriv Java-setninger her
		
		final double TRINN_1 = 0.0093;
		final double TRINN_2 = 0.0241;
		final double TRINN_3 = 0.1152;
		final double TRINN_4 = 0.1452;
		
		int lønn = parseInt(showInputDialog("Skriv lønn:"));

		if (lønn < 164100)
			System.out.print("Ingen trinnskatt");
		if (lønn < 230951 && lønn > 164100)
			System.out.print("Trinnskatten er: " + (lønn * TRINN_1));
		if (lønn > 230950 && lønn < 580651)
			System.out.print("Trinnskatten er: " + (lønn * TRINN_2));
		if (lønn > 580650 && lønn < 934051)
			System.out.print("Trinnskatten er: " + (lønn * TRINN_3));
		if (lønn > 934050)
			System.out.print("Trinnskatten er: " + (lønn * TRINN_4));
		
		
			
	
		
	}

}

