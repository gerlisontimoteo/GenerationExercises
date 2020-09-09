package biggernumber;

import java.util.Locale;
import java.util.Scanner;

//this program will find the biggest number out of 3 inputs

public class BiggerNumber {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		int c=0, number, bigger = 0;
		
		while (c<3) {   //3 x loop so we can get 3 inputs from the user			
			System.out.println((c+1)+" - Enter the number: ");
			number = kb.nextInt();
			
			if(number>bigger){  //the input will be compared to a controller 'bigger' to determine who's actually bigger
				bigger = number;
			}
			c = c+1; 
		}
		System.out.println("The biggest number is "+bigger);
		kb.close();
	}

}
