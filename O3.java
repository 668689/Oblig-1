package oblig1;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Math.*;


public class O3 {
	public static void main(String[] args) {
		// Skriv Java-setninger her
	
		boolean ulovlig;
	    int n;
	 
	    do { // Leser inn lovlig n-verdi
	      String tallTxt = showInputDialog("Gi n =");
	      n = parseInt(tallTxt);
	      ulovlig = (n < 0  || 12 < n);
	      if (ulovlig)
	        showMessageDialog(null, "Ugyldig n-verdi!");
	    } while (ulovlig);
	 
	    showMessageDialog( null, n + "! = " + fakultet(n) );
	  }
	 
	  public static int fakultet(int maxTall) {
	    int nFak = 1;
	    for (int tall=1; tall<=maxTall; tall++)
	      nFak = nFak * tall;
	    return nFak;
	  }
	 
	}
