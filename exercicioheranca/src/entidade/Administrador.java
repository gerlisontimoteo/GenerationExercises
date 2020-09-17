package entidade;

public class Administrador extends Pessoa {
	public Administrador(String nome, String endere�o, String telefone) {
		super(nome, endere�o, telefone);
	}
	private double verba;
	private double ajudaDeCusto;
	public Administrador(String nome, String endere�o, String telefone, double verba) {
		super(nome, endere�o, telefone);
		this.verba = verba;
	}
	public Administrador(String nome, String endere�o, String telefone, double verba, double ajudaDeCusto) {
		super(nome, endere�o, telefone);
		this.verba = verba;
		this.ajudaDeCusto = ajudaDeCusto;
	}
	public double getVerba() {
		return verba;
	}
	public void setVerba(double verba) {
		this.verba = verba;
	}
	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}
	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
}
