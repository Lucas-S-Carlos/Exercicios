package Pet_Cachorro;

public class Pet {
	String nome;
	private int fome;
	public int getFome() {
		return fome;
	}
	public void setFome(int fome) {
		this.fome = fome;
	}
	
	
	int comida;
	public int Alimentar(int fome, int comida) {
		return fome = fome + comida;
	}
	
}
