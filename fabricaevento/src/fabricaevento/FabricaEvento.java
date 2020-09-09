package fabricaevento;

import java.util.Locale;
import java.util.Scanner;

/*A duração do evento será dado em segundos
 * e então convertido para horas
   minutos e segundos */

public class FabricaEvento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int time, timeH, timeMin, timeSeg;
		
		System.out.println("Qual a duração do evento em segundo? ");
		time = teclado.nextInt();
		
		timeH = (time/3600); 
	    timeMin = ((time%3600)/60); 
	    timeSeg = (time%3600)%60;
	    System.out.printf("O evento na fábrica"
	    		+ " durou %d h, %d min e %d s. ", timeH, timeMin, timeSeg);
	    teclado.close();
	}

}
