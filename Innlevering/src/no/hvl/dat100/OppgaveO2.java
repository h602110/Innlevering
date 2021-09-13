package no.hvl.dat100;

public class OppgaveO2 {

public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
		
		String tallStr = javax.swing.JOptionPane.showInputDialog("Poengsum?");
		int tall = Integer.parseInt(tallStr);
		
	
		if (tall > 100) {
			System.out.println("Feilmelding, poengsum må være mellom 0 og 100");
			tallStr = javax.swing.JOptionPane.showInputDialog("Poengsum?");
			tall = Integer.parseInt(tallStr);
		}
		else if (tall >= 90) {
			System.out.println("Karakter A");
		}
		else if (tall >= 80) {
			System.out.println("Karakter B");
		}
		else if (tall >= 60) {
			System.out.println("Karakter C");
		}
		else if (tall >= 50) {
			System.out.println("Karakter D");
		}
		else if (tall >= 40) {
			System.out.println("Karakter E");
		}
		else if (tall >= 0) {
			System.out.println("Karakter F");
		}
		else if (tall < 0) {
			System.out.println("Feilmedling, poengsum må være mellom 0 og 100");
			tallStr = javax.swing.JOptionPane.showInputDialog("Poengsum?");
			tall = Integer.parseInt(tallStr);
		}
		}

	}

}

