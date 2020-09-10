package averagethree;

import java.util.Locale;
import java.util.Scanner;

//in this program the user will enter number until he types 0. Then it will be returned the sum of those number that are multiple of 3.

public class AverageThree {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		
		float num=0, c=-1, cc=0; //num: the input number; avg: the average of the numbers multiple of 3; c and cc are controllers 
		
		do {
			System.out.println("Enter an integer number: ");
			num = kb.nextInt();
			
			if(num%3 == 0) {
				c++;
				cc = cc + num;
			}
		}while(num!=0);
		System.out.printf("The average of the numbers multiple of 3 is %.2f. ", (cc/c));
		
		kb.close();
	}

}
