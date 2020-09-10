package increasingorderchallenge;

import java.util.Locale;
import java.util.Scanner;

//this program will receive 3 integer inputs and set them in increasing order
public class IncrOrderChallenge {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Enter the number A: ");
		a = kb.nextInt();
		System.out.println("Enter the number B: ");
		b = kb.nextInt();
		System.out.println("Enter the number C: ");
		c = kb.nextInt();
		
		//possible results for the order: C<B<A| C<A<B| A<C<B| B<C<A| B<A<C| 
		//A<B<C| A=B<C| A=B>C| B=C<A| B=C>A| A=C<B| A=C>B| A=B=C
		
		if (a>=b && b>=c) {
				System.out.printf("The numbers in increasing order are: %d, %d, %d",c,b,a);			
		}
		kb.close();
	}

}
