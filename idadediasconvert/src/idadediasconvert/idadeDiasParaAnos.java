package idadediasconvert;

/* Esse programa vai ler a idade do usu�rio
 * em dias e vai converter  
 * para anos meses e dias */ 

import java.util.Scanner;

public class idadeDiasParaAnos {

	public static void main(String[] args) {
		//Dados de entrada
				int idadeDia, ano, mes, dia;
				String nome;
				Scanner teclado = new Scanner(System.in);
				
				System.out.println("Qual o seu nome? ");
				nome = teclado.nextLine();
				
				System.out.println("Qual a sua idade em dias? ");
				idadeDia = teclado.nextInt();
				
		/* 1 ano = 365 dias
		 * 1 m�s = 30 dias	
		 * Convers�o da idade ser� feita */
				
				ano = idadeDia/365;
				mes = (idadeDia%365)/30;
				dia = (idadeDia%365)%30;
				
				System.out.printf("Ol�, %s .Sua idade � %d anos, %d mes/es e %d dia/s de vida!", nome, ano, mes, dia);
				
				teclado.close();
				

	}

}
