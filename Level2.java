package ccc_snackmachine;

public class Level2 {

	public static void main(String[] args) {
		int betrag = Integer.parseInt(args[0]);
		int anzahlMuenzen = Integer.parseInt(args[1]);
		int[] muenzen = new int[anzahlMuenzen];
		
		for(int m=0; m < anzahlMuenzen; m++) {
			int offset = 2;
			muenzen[m] = Integer.parseInt(args[offset+m]);
		}
			int geldEinwerfen = 0;
			int diff = 0;
			
			for(int g = 0; g < anzahlMuenzen; g++) {
				geldEinwerfen += muenzen[g];
				
			}
			if (geldEinwerfen < betrag) {
				diff = betrag - geldEinwerfen;
				System.out.println("MISSING: " + diff);
			}
			if (betrag < geldEinwerfen) {
				 diff = geldEinwerfen - betrag;
				 
				System.out.println("CHANGE: " + diff);
				
			}
			int rest = diff;
		while(rest > 0) {
			if(rest/20 > 0) {
				System.out.println(rest/20);
				System.exit(0);
			}
		}
	}

	}


