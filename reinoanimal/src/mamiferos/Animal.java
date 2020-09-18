package mamiferos;

public class Animal {
	private String nome;
	private int idade;
	private boolean emiteSom;
	
	public Animal() {
		super();
	}

	public Animal(String nome) {
		super();
		this.nome = nome;
	}
	
	public Animal(String nome, boolean emiteSom) {
		super();
		this.nome = nome;
		this.emiteSom = emiteSom;
	}

	public Animal(String nome, int idade, boolean emiteSom) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.emiteSom = emiteSom;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isEmiteSom() {
		return emiteSom;
	}

	public void setEmiteSom(boolean emiteSom) {
		this.emiteSom = emiteSom;
	}
	
	
}
