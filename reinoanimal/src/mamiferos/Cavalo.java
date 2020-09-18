package mamiferos;

public class Cavalo extends Animal {
	private boolean devecorrer;

	public Cavalo(boolean devecorrer) {
		super();
		this.devecorrer = devecorrer;
	}

	public boolean isDevecorrer() {
		return devecorrer;
	}

	public void setDevecorrer(boolean devecorrer) {
		this.devecorrer = devecorrer;
	}
	
}
