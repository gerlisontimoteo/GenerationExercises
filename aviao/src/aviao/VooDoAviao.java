package aviao;

public class VooDoAviao {

	public static void main(String[] args) {
		Aviao aviaoA = new Aviao("Boeing 747","A7AWAA");
		System.out.println("Ol�, qual o seu voo? ");
		System.out.print(aviaoA.IDvoo());
		
		System.out.print("\n\nQuantos assentos ainda est�o dispon�veis? ");
		aviaoA.capacidade = 100;
		System.out.println(aviaoA.Ocupacao(78));
		

	}

}
