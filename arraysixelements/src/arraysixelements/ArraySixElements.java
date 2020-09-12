package arraysixelements;

import java.util.Locale;
import java.util.Scanner;

//in this program the user will enter with 6 elements to fill in an array
//since it's too troublesome to translate a long description  of a question, I will just copypaste that in ptbr
/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.*/

public class ArraySixElements {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		
		int arrayX[] = {0, 0, 0, 0, 0, 0};
		
		for(int c=0; c<6; c++) {
			System.out.printf("\nEnter with the array's element X[%d]: ", c+1);
			arrayX[c] = kb.nextInt();
			System.out.printf("%d | ", arrayX[c]);
		}
		
		for(int c=0; c<3; c++) {
			System.out.println("\n");
		}
		
		for(int c=0; c<6; c++) {
			System.out.printf("%3d | ", arrayX[c]);
		}
		for(int c=0; c<2; c++) {
			System.out.println("\n");
		kb.close();
		}
	}
}

