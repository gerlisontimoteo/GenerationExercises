package arrayAwithsixslots;
import java.util.Locale;

//in this program we're gonna be working with an array with six int number. The exercise's description is too long that'd be a waste to translate that into portuguese :)
/*Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.*/


public class ArrayA {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int arrayA[] = {1, 0, 5, -2, -5, 7}, x ;

		x = arrayA[0] + arrayA[1] + arrayA[5];
		
		System.out.printf("The sum of the elements A[0], A[1] e A[5] in the arrayA is %d. \n\n", x);
		
		arrayA[4] = 100;
		System.out.printf("  A[1]: %d\n  A[2]: %d\n  A[3]: %d\n  A[4]: %d\n  A[5]: %d\n  A[6]: %d\n", arrayA[0], arrayA[1], arrayA[2], arrayA[3], arrayA[4], arrayA[5]);
	}
}
