package countoddeven;

import java.util.Locale;
import java.util.Scanner;

//in this program the user will input 10 numbers. Then it will be displayed how many of those number are odd, and how many are even.

public class CountOddEven {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		
		int c, x, oc=0;  //c is the control number; x is the input number, oc is the odd numbers counter;
		
		for(c=0;c<10;c++) {
			System.out.println("Enter a number: ");
			x = kb.nextInt();
			if(x%2 == 0) {
				oc++;
			}
		}
		System.out.printf("%d numbers are even! And %d are odd! ", (Math.abs(10-oc)), oc);
		
		kb.close();
	}

}
