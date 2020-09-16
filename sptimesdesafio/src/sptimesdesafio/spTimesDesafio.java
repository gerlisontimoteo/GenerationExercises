package sptimesdesafio;

import java.util.Locale;
import java.util.Scanner;

public class spTimesDesafio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		
		int r=0, c=0, pontotime[] = new int[4]; //c: contador  pontotime:pontos de cada time   pontos:pontuação na rodada
		String pontos[]=new String[4]; 
		
		for(r=0;r<3;r++) {
			do{
				System.out.println((c==0)?"Curintias ganhou, empatou, ou perdeu? ":(c==1)?"Santos ganhou, empatou, ou perdeu? ":(c==2)?"SPFC ganhou, empatou, ou perdeu? ":"Palmeiras ganhou, empatou, ou perdeu? ");
			pontos[c] = kb.next();
			if(pontos[c].contentEquals("ganhou")){
				pontotime[c]=3;
			}
			if(pontos[c].contentEquals("empatou")) {
				pontotime[c]=1;
			}
			if(pontos[c].contentEquals("perdeu")) {
				pontotime[c]=0;
			}
			c++;
			}while(c<4);
		}
		System.out.println(pontotime[c]);
		kb.close();
	}

}
/*package TabelaBrasileirao;

import java.util.Locale;
import java.util.Scanner;

public class SegundaParte {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		
		int r=0, c=0; //c: contador  pontotime:pontos de cada time   pontos:pontuação na rodada
		int[] pontoTime = {0,0,0,0};
		int pontos =0;
		String[] vTimes = {"CORINTHIANS", "PALMEIRAS", "SANTOS", "SPFC"};
		
	
		for(r=0;r<3;r++) 
		{
			for(c=0;c<4;c++)
			{
				System.out.printf(" %s 1 - ganhou, 2 - empatou, ou 3 - perdeu? \n", vTimes[c]);
				pontos=kb.nextInt();
						
				if(pontos==1)
				{
					pontoTime[c]=pontoTime[c]+3;
				}
				else if(pontos==2)
				{
					pontoTime[c]=pontoTime[c]+1;
				}
				else if(pontos==3)
				{
					pontoTime[c]=pontoTime[c];
				}
			}
		
		}
		
		for(int tabela=0; tabela<4; tabela++)
		{
			System.out.printf("%s tem %d ptos. \n", vTimes[tabela], pontoTime[tabela]);
		}
	
		kb.close();
	}

}*/
























