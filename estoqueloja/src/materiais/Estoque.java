package materiais;

public class Estoque {
	private String nomeDoProduto;
	private int qtddDoProduto; //quantidade do produto
	private double precoDoProduto;
	
	public Estoque() {
		
	}

	public Estoque(String nomeDoProduto, int qtddDoProduto, double precoDoProduto) {
		super();
		this.nomeDoProduto = nomeDoProduto;
		this.qtddDoProduto = qtddDoProduto;
		this.precoDoProduto = precoDoProduto;
	}

	public String getNomeDoProduto() {
		return nomeDoProduto;
	}

	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}

	public int getQtddDoProduto() {
		return qtddDoProduto;
	}

	public void setQtddDoProduto(int qtddDoProduto) {
		this.qtddDoProduto = qtddDoProduto;
	}

	public double getPrecoDoProduto() {
		return precoDoProduto;
	}

	public void setPrecoDoProduto(double precoDoProduto) {
		this.precoDoProduto = precoDoProduto;
	}
	
}
