package mamiferos;

public class Cachorro extends Animal {
	private boolean devecorrer;

	public Cachorro() {
		
	}	
	public Cachorro(boolean devecorrer) {
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
