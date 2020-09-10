package countuntilzero;

import java.util.Locale;
import java.util.Scanner;

//in this program the user will input how many number he wishes until the entered integer number is 0.
//then the numbers will be summed up

public class CountUntilZero {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		
		int number=0, sum=0; //c is the sum

		do {
			System.out.println("Enter an integer: ");
			number = kb.nextInt();

			sum = sum + number;
			
		} while (number!=0);
		System.out.printf("\nThe sum of the numbers entered is %d.", sum);
		
		kb.close();
	}

}
