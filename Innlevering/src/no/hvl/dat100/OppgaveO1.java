package no.hvl.dat100;

import static javax.swing.JOptionPane.*;


public class OppgaveO1 {

	public static void main(String[] args) {
		
		String lonntxt = showInputDialog("lønn?");
		double lonn = Double.parseDouble(lonntxt);
		
		
		double skatt = 0;
		
		if (lonn > 1021550) {
			skatt = lonn * 0.162;	
		}
		else if (lonn > 651250) {
			skatt = lonn * 0.132;
		}
		else if (lonn > 260100) {
			skatt = lonn * 0.04;
		}
		else if (lonn > 184800) {
			skatt = lonn * 0.017;
		}
		String utTekst = "skatt blir " + skatt;
		
		showMessageDialog(null, utTekst);

	}

}


