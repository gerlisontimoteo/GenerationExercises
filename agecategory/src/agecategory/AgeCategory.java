package agecategory;

import java.util.Locale;
import java.util.Scanner;

//this program will tell in which age category is the user
//10-14yo child
//15-17 teenager
//18-25 adult

public class AgeCategory {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		
		int age;
		
		System.out.println("Hello. How old are you? ");
		age = kb.nextInt();
							
		if(age>=10 && age<=14) {
				System.out.println("You're a child! ");
			}
		else if(age>=15 && age<=17) {
				System.out.println("You're a teenager! ");
			} 
		else if(age>=18 && age<=25) {
				System.out.println("You're an adult! ");
		} else {
				System.out.printf("You are %d old!",age);
		}
		
		kb.close();	
	}

}
