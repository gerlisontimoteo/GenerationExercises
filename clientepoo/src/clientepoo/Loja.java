package clientepoo;

import java.util.Locale;

public class Loja {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Cliente comprador = new Cliente();
		
		comprador.nome = "Jurema da Silva";
		comprador.email = "juremadasilva@hotmail.com";
		comprador.dinheiro = 1750.;
		
		comprador.perfil();
		System.out.printf("\nA cliente %s comprou %.2f produtos!", comprador.nome, comprador.compra(10.5));
	}

}
