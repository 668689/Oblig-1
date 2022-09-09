package oblig1;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Math.*;


public class O2 {
	public static void main(String[] args) {
		// Skriv Java-setninger her
		
		String melding = "Skriv poengsum:";
		int ANT_STUDENTER = 10;
		
		for (int antStudenter=1; antStudenter<=ANT_STUDENTER; antStudenter++) {	
		
			int poengsum = parseInt(showInputDialog(melding)); 
			if (poengsum > 100 || poengsum < 0)
				ANT_STUDENTER++;
			
				if (poengsum >= 0 && poengsum <= 39)
					showMessageDialog(null, "Karakter F");
				if (poengsum >= 40 && poengsum <= 49)
					showMessageDialog(null, "Karakter E");
				if (poengsum >= 50 && poengsum <= 59)
					showMessageDialog(null, "Karakter D");
				if (poengsum >= 60 && poengsum <= 79)
					showMessageDialog(null, "Karakter C");
				if (poengsum >= 80 && poengsum <= 89)
					showMessageDialog(null, "Karakter B");
				if (poengsum >= 90 && poengsum <= 100)
					showMessageDialog(null, "Karakter A");
				if (poengsum < 0 || poengsum > 100)
					showMessageDialog(null, "Ugyldig poengsum");
		}
	} 
}
			
	
			
			
	
			

		

		
		

		
