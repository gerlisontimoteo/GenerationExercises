package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import materiais.Estoque;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		String nome;
		int quantidade;
		double preco;
		int n,c;
		
		List<Estoque> list = new ArrayList();
		System.out.println("Qual o numero de items?");
		n = kb.nextInt();
		
		for(c=0;c<n;c++) {
			System.out.println("Qual o produto?");
			nome = kb.next().toUpperCase();
			System.out.println("Qual a quantidade em estoque? ");
			quantidade = kb.nextInt();
			System.out.println("Qual o preço por unidade? ");
			preco = kb.nextDouble();
			
			list.add(new Estoque(nome, quantidade, preco));
		}
		for(Estoque estoque: list) {
			System.out.println("Produto: "+estoque.getNomeDoProduto()+"\nQuantidade: "+estoque.getQtddDoProduto()+"\nPreço: "+estoque.getPrecoDoProduto());
		}
		kb.close();
	}

}
