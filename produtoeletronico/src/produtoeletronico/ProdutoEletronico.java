package produtoeletronico;

public class ProdutoEletronico {
	
	public String modelo;
	public double preco;
	public int geracao;
	public int ultimageracao;
	public double desempenho;
	
	public void info() {
		System.out.printf("O produto eletrônico é do modelo %s da %d a geração.",modelo,geracao);
	}
	
	public double valor(){
		double valoragregado = desempenho*preco/(ultimageracao - geracao);
		return valoragregado;
	}
	

}
