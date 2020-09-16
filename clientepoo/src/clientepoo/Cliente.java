package clientepoo;

public class Cliente {
	
	public String nome;
	public String email;
	public double dinheiro;
	
	public void perfil() {
		System.out.print("O/A cliente " +nome+ " possui o contato " +email+ ". ");
	}
	
	public double compra(double preco) {
		double qtddcomprada = this.dinheiro/preco;	
		return qtddcomprada;
	}

}
