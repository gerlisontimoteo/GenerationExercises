package increasingorder;

import java.util.Locale;
import java.util.Scanner;

//this program will receive 3 integer inputs and set them in increasing order
public class IncreasingOrder {

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
		
		if (a>b && a>c) {
			if(b>c) {
				System.out.printf("The numbers in increasing order are: %d, %d, %d",c,b,a);
			}			
		}
		if(b>a && b>c) {
			if(a>c) {
				System.out.printf("The numbers in increasing order are: %d, %d, %d",c,a,b);
			}
		} 
		if(b>a && b>c) {
			if(c>a) {
				System.out.printf("The numbers in increasing order are: %d, %d, %d",a,c,b);
			}
		}
		if(a>b && a>c) {
			if(c>b) {
				System.out.printf("The numbers in increasing order are: %d, %d, %d",b,c,a);
			}
		} 
		if(c>a && c>b) {
			if(a>b) {
				System.out.printf("The numbers in increasing order are: %d, %d, %d",b,a,c);
			}
		} 
		if(c>a && c>b) {
			if(b>a) {
			System.out.printf("The numbers in increasing order are: %d, %d, %d",a,b,c);
			}
		}
		if(a==b & a>c) {
			System.out.printf("The numbers in increasing order are: %d, %d, %d",c,a,b);	
			}
		if(a==b & a<c) {
			System.out.printf("The numbers in increasing order are: %d, %d, %d",a,b,c);	
			}
		if(b==c & b>a) {
			System.out.printf("The numbers in increasing order are: %d, %d, %d",a,b,c);	
			}
		if(b==c & b<a) {
			System.out.printf("The numbers in increasing order are: %d, %d, %d",b,c,a);	
			}
		if(b==c & b==a) {
			System.out.printf("The numbers in increasing order are: %d, %d, %d",a,b,c);	
			}
		kb.close();
	}

}
