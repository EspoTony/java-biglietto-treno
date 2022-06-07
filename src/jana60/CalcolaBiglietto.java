package jana60;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		// variabili
		float numeroChilometri;
		int anniPasseggero;
		float scontoMinorenni;
		float scontoOver65;
		// inizio scanner
		Scanner scan = new Scanner (System.in);
		//input utente
		System.out.println("Chilometri da percorrere");
		numeroChilometri = scan.nextFloat();
		
		System.out.println("Età passeggero");
		anniPasseggero = scan.nextInt();
		//variabili prezzi biglietti
		float prezzoBiglietto = numeroChilometri * 0.21f;
			//calcolo prezzo biglietto
		if(anniPasseggero < 18) {
			scontoMinorenni = prezzoBiglietto * 0.2f;
			System.out.println("Normalmente il prezzo del biglietto sarebbe:" + prezzoBiglietto + " euro");
			System.out.println("Ma per i minorenni verrà applicato uno sconto del 20%. Quindi il prezzo del biglietto sarà: ");
			System.out.println(scontoMinorenni + "euro");
		} else if (anniPasseggero > 65) {
			scontoOver65 = prezzoBiglietto * 0.4f;
			System.out.println("Normalmente il prezzo del biglietto sarebbe:" + prezzoBiglietto + " euro");
			System.out.println("Ma per gli over65 verrà applicato uno sconto del 40%. Quindi il prezzo del biglietto sarà: ");
			System.out.println(scontoOver65 + "euro");
		}else {
			System.out.println("Il prezzo del biglietto è: " + prezzoBiglietto);
		}

		scan.close();

	}

}
