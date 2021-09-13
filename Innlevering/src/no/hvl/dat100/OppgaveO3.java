package no.hvl.dat100;

public class OppgaveO3 {

public static void main(String[] args) {
		
		String tallStr = javax.swing.JOptionPane.showInputDialog("Oppgi et heltall større enn 0");
		int tall = Integer.parseInt(tallStr);
		
		int x = 1;
		int n = tall;
		
		while (n > 1) {
			x *= n;
			n--;
		}
		System.out.println(tall + "! = " + x);

	}

}

