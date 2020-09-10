package ternarioorientation;

import java.util.Scanner;

//the use will confirm what's their orientation etc

public class TernarioOrientation {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int x;
		System.out.println("What do you identify yourself as: 1 - male\n 2 - female\n 3 - other \n");
		x = kb.nextInt();
		
		System.out.print((x==1)?"You're a male. ":(x==2)?"You're a female":"Hello! You are yourself!");
		
		kb.close();
	}

}
