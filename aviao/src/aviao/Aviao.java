package aviao;

public class Aviao {
	
	private String modelo;
	private String registro;
	public double velocidade;
	public int capacidade;
	
	public Aviao(String modeloAviao, String registroAviao) {
		modelo = modeloAviao;
		registro = registroAviao;
	}
	
	public String IDvoo(){
		String voo = "O voo do " + modelo + " possui registro " + registro +".";
		return voo;
	}
	
	public int Ocupacao(int passageiros) {
		int assentosdisponiveis = this.capacidade - passageiros;
		return assentosdisponiveis;
	}

}
