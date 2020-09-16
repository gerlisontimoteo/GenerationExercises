package produtoeletronico;

import java.util.Locale;

public class ProdutoEletronicoMain {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		ProdutoEletronico produtO = new ProdutoEletronico();
		produtO.modelo = "buginganda";
		
		produtO.geracao = 8;
		produtO.ultimageracao = 11;
		produtO.desempenho = 28;
		produtO.preco = 3879.90;
		System.out.printf("\nO valor agregado da %s é %.2f.", produtO.modelo, produtO.valor());

	}

}
