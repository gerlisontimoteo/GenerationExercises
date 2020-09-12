package matrixoperations;

import java.util.Locale;
import java.util.Scanner;

//this program will read 2 matrixes with real numbers. THe user will opt between few mathematical operations.

/* Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a ao usu�rio um menu de op��es:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. Na terceira op��o o valor da constante deve ser lido e o resultado da adi��o da constante deve ser armazenado na pr�pria matriz.*/

public class MatrixOp {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		
		int matrix[][] = new int [2][2], l=0, c=0;
		
		for(l=0;l<2;l++) {
			for(c=0;c<2;c++) {
				System.out.printf("Enter the element [%d][%d]",(l+1),(c+1));
				matrix[l][c] = kb.nextInt();
			}
		}
		System.out.println();
		for(l=0;l<2;l++) {
			for(c=0;c<2;c++) {
				System.out.printf("\t %d \t",matrix[l][c]);
			}
			System.out.println("\n");
		}
		kb.close();
	}

}
