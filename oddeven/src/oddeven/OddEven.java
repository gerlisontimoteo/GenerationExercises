package oddeven;

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

//this program will read a number and tell if it's odd or even
//it will also find the sqrt of the number in case it's even
//it will find the second power if the number is odd

public class OddEven {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		
		float n; 
		
		System.out.println("Type a number: ");
		n = kb.nextFloat();
		
		if(n%2==0) {
			
			System.out.printf("The number %.0f is even. The square root of %.0f is %.2f",n,n,Math.sqrt(n) );
			
		} else {
			System.out.printf("The number %.0f is odd. The second power of %.0f is %.0f", n,n,Math.pow(n, 2));
		}
		kb.close();
	}

}
