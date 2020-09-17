package mainapplication;

import entidade.Fornecedor;

public class Teste {

	public static void main(String[] args) {
		Fornecedor fornecedorTeste = new Fornecedor("Dell","SP","9999999",25000,13780);
		System.out.println(fornecedorTeste.getNome());
		
		System.out.println(fornecedorTeste.obterSaldo());
		

	}

}
