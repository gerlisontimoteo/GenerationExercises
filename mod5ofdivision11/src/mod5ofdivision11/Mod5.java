package mod5ofdivision11;

//this program will check which numbers from 1000 1999 return mod 5 when divided by 11

import java.util.Locale;

public class Mod5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int x;
		
		for(x=1000;x<=1999;x++) {
			if(x%11 == 5) {
				System.out.printf("%d - ",x);
			}
		}

	}

}
