package companyresearch;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

//the description of this question is too damn long for me to translate into english. Bear with it!
/*Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino), e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)

o número de pessoas calmas; 
o número de mulheres nervosas; 
o número de homens agressivos; 
o número de pessoas nervosas com mais de 40 anos; 
o número de pessoas calmas com menos de 18 anos.*/

public class CompanyResearch {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		
		int x=0, age, sex, emot, cc=0, ca=0, csw=0, cam=0, cs40=0, cc18=0; //x: is a controller; age: age of the person; sex: sex of the person; emot: emotional state of the person; cc: people that are calm; cws: women that are stressed out; cma: men that are aggressive; cs40: people above 40yo that are stressed out; cc18: people under 18 that are calm 
		
		while(x<150) {
			x++;
			System.out.println("\nEnter your age: ");
			age = kb.nextInt();
			
			System.out.println("What's your sex? Press \n 1 - female\n 2 - male");
			sex = kb.nextInt();
			
			System.out.println("How would you describe yourself at this moment? \n 1 - calm\n 2 - stressed\n 3 - aggressive");
			emot = kb.nextInt();
			
			if(emot==1) {
				cc++;
			}
			
			if(sex==1 && emot==2) {
				csw++;
			}
			
			if(sex==2 && emot==3) {
				cam++;
			}
			
			if(age>40 && emot==2) {
				cs40++;
			}
			
			if(age<18 && emot==1) {
				cc18++;
			}
		}
		System.out.printf("%d people are calm.\n%d women are stressed out. \n%d men are aggressive. \n%d above 40yo people are stressed out. \n%d 18yo people are calm. ", cc, csw, cam, cs40, cc18);
				
		kb.close();
	}

}
