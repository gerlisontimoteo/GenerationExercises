package entidades;
import interfaces.TransacoesComuns;

public abstract class ContaBancaria implements TransacoesComuns{
	
	private int numero;
	private double saldo = 0;
	private double transacoes[];
	
	//Construtores
	public ContaBancaria(int numero) {
		this.numero = numero;
	}
	
	//Metodos
	@Override
	public void emiteExtrato() {
		System.out.println(this.getSaldo());
	}
	@Override
	public double credite(double credite) {
		this.saldo += credite;
		return this.saldo;
	}
	@Override
	public double debite(double debite) {
		this.saldo -= debite;
		return this.saldo;
	}	
	//Getters e Setters
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
}