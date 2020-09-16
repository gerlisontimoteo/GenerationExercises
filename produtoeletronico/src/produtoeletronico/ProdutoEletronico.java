package produtoeletronico;

public class ProdutoEletronico {
	
	public String modelo;
	public double preco;
	public int geracao;
	public int ultimageracao;
	public double desempenho;
	
	public void info() {
		System.out.printf("O produto eletr�nico � do modelo %s da %d a gera��o.",modelo,geracao);
	}
	
	public double valor(){
		double valoragregado = desempenho*preco/(ultimageracao - geracao);
		return valoragregado;
	}
	

}
