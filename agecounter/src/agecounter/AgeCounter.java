package agecounter;

import java.util.Locale;
import java.util.Scanner;

//in this program the user may enter their age multiple times. The number of people below 21yo and the number of people above the age of 50 will be counted

public class AgeCounter {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		
		int age, c21=0, c50=0; //c21 and c50 are control numbers
		
		System.out.println("Enter your age. If you want to end the program type -99. ");
		age = kb.nextInt();
		
		while(age!=-99) {
			System.out.println("Enter your age. If you want to end the program type -99. ");
			age = kb.nextInt();
			if(age<21) {
				c21++;
			}
			if(age>50) {
				c21++;
			}
		}
		System.out.printf("%d people are under 21yo. And %d are above the age of 50. ", c21, c50);
		
		kb.close();
		}
	}


