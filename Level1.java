package ccc_snackmachine;

public class Level1 {

	public static void main(String[] args) {
		int betrag = Integer.parseInt(args[0]);
		int anzahlMuenzen = Integer.parseInt(args[1]);
		int[] muenzen = new int[anzahlMuenzen];
		
		for(int m=0; m < anzahlMuenzen; m++) {
			int offset = 2;
			muenzen[m] = Integer.parseInt(args[offset+m]);
		}
			int geldEinwerfen = 0;
			
			for(int g = 0; g < anzahlMuenzen; g++) {
				geldEinwerfen += muenzen[g];
				
			}
			if (geldEinwerfen < betrag) {
				int diff2 = betrag - geldEinwerfen;
				System.out.println("MISSING: " + diff2);
			}
			if (betrag < geldEinwerfen) {
				 int diff1 = geldEinwerfen - betrag;
				System.out.println("CHANGE: " + diff1);
			}
		
	}

}
