package idade;

import java.util.Calendar;
import java.util.Scanner;

/* Esse programa vai ler a idade do usuário
 * em anos meses e dias e entao converter para 
  apenas dias */  

public class IdadeContador {

	public static void main(String[] args) {
//Dados de entrada
		int idadeAno, idadeMes, idadeDia, dataNasc, dataAtual, idadeAtual;
		String nome;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual o seu nome? ");
		nome = teclado.nextLine();
		
		System.out.println("Qual o ano do seu nascimento? ");
		idadeAno = teclado.nextInt();
		System.out.println("Qual o mês do seu nascimento? ");
		idadeMes = teclado.nextInt();
		System.out.println("Qual o dia do seu nascimento? ");
		idadeDia = teclado.nextInt();
		
/* 1 ano = 365 dias
 * 1 mês = 30 dias	
 * Conversão da idade será feita */
		
		Calendar data = Calendar.getInstance();
		dataNasc = idadeAno*360 + idadeMes*30 + idadeDia;
		dataAtual = (data.get(Calendar.YEAR))*360 + (data.get(Calendar.MONTH))*30 + data.get(Calendar.DATE);
		idadeAtual = dataAtual - dataNasc;
		
		System.out.printf("Olá, %s .Sua idade é %d de vida!", nome, idadeAtual);
		
		teclado.close();
		
		
	
		
		
		
	}

}
