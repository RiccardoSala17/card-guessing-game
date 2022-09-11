package giococarte;
import java.util.Random;

public class Carta {
	
	private String seme;
	private int valore;
	
	public Carta (String seme, int valore) {
		this.seme = seme;
		this.valore = valore;
	}
	
	public String getSeme () {
		return this.seme;
	}
	
	public int getValore () {
		return this.valore;
	}
	
	public void setSeme (String seme) {
		this.seme = seme;
	}
	
	public void setValore (int valore) {
		this.valore = valore;
	}
	
	public static Carta estrai() {
		
		Random rand = new Random();
		String[] semePool = new String[] {"cuori", "quadri", "fiori", "picche"};
		int randValore = rand.nextInt(3) + 1;
		String randSeme = semePool[rand.nextInt(3)];
		Carta randCarta = new Carta(randSeme, randValore);
		return randCarta;
	}
	
	@Override 
	
	public boolean equals(Object obj) {
		
		if (this == obj)
            return true;
 
        if (obj == null || this.getClass() != obj.getClass())
            return false;
 
        Carta c1 = (Carta)obj;
 
        return this.getSeme().equals(c1.getSeme()) && this.getValore() == c1.getValore();
	}
	
}
