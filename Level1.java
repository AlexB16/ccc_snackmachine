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
				int diff1 = 0;
				if (betrag < geldEinwerfen) {
					diff1 = betrag - geldEinwerfen;
					System.out.println("CHANGE: " + diff1);
				}
			
			}
		
		
		
	}

}
