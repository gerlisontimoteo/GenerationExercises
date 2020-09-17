package entidade;

public class Fornecedor extends Pessoa{

	public Fornecedor(String nome, String endereço, String telefone) {
		super(nome, endereço, telefone);
		// TODO Auto-generated constructor stub
	}
	
	private double valorCredito;
	private double valorDivida;
	public Fornecedor(String nome, String endereço, String telefone, double valorCredito) {
		super(nome, endereço, telefone);
		this.valorCredito = valorCredito;
	}
	public Fornecedor(String nome, String endereço, String telefone, double valorCredito, double valorDivida) {
		super(nome, endereço, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	public double obterSaldo() {
		//double saldo = this.valorCredito - this.valorDivida;
		return (this.valorCredito - this.valorDivida);
	}
}
