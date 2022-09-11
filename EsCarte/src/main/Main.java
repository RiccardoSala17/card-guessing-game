package main;
import giococarte.Carta;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		
		String inputSeme = "";
		int inputValore = 0;
		
		while(true) {
			
			String[] semePool = new String[] {"cuori", "quadri", "fiori", "picche"};
			
			System.out.println("Scegli il seme della tua carta: ");
			String is = new Scanner(System.in).nextLine();
			if (Arrays.asList(semePool).contains(is)) {
				inputSeme = is;
				break;
			}
			else 
				System.out.println("Valore non valido!");
		}
		
		while(true) {
			
			System.out.println("Scegli il valore della tua carta: ");
			int iv = new Scanner(System.in).nextInt();
			if (iv > 0 && iv < 4) {
				inputValore = iv;
				break;
			}
			else 
				System.out.println("Valore non valido!");
		}
		
		/*
		if (inputValore == 1)
			System.out.println("Hai scelto l'asso di " + inputSeme);
		else
			System.out.println("Hai scelto il " + inputValore + " di " + inputSeme);
		*/
		
		System.out.println("Hai scelto il " + inputValore + " di " + inputSeme);
		Carta c = new Carta(inputSeme, inputValore);
		int count = 0;
		
		while (true) {
			count++;
			if (Carta.estrai().equals(c))
				break;				
		}
		
		System.out.println("Ci ho messo " + count + " tentativi per estrarre la carta");
	
	}

}
