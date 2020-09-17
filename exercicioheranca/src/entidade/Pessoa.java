package entidade;

public class Pessoa {
	private String nome; 
	private String endereço; 
	private String telefone;
	public Pessoa(String nome, String endereço, String telefone) {
		super();
		this.nome = nome;
		this.endereço = endereço;
		this.telefone = telefone;
	}
	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}
	public Pessoa(String nome, String endereço) {
		super();
		this.nome = nome;
		this.endereço = endereço;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	} 

}
