package entidades;

import java.util.Scanner;

public class Aluno {

	public String nomeAluno;
	public int anoNascimentoAluno;
	public char sexAluno;
	public char turmaAluno;
	public double nota[]= new double[3];
	public double mediaFinal;
	public double mediaEscolar;
	
	double mediaDoAluno() {
		Scanner kb = new Scanner(System.in);
		double mediaFinal=0;
		for (int c=0; c<4;c++) {
			System.out.printf("\nQual a nota A%f? ",(c+1));
			nota[c] = kb.nextDouble();
			mediaFinal = (mediaFinal+nota[c])/(c+1);
		}
		kb.close();
		return mediaFinal;
	}
	void passouounao(){
		Scanner kb = new Scanner(System.in);
		System.out.println("Qual a média para passar de ano? ");
		double mediaEscolar = kb.nextDouble();
		if(this.mediaFinal<mediaEscolar) {
			System.out.println("O aluno não passou!");
		} else {
			System.out.println("O aluno passou!");
		}
		kb.close();
	}
	
	
}
