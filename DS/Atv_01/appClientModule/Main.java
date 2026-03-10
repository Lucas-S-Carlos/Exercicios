
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mamifero Mamifero = new Mamifero();
		
		Mamifero.Nome = "Ornintorrinco";
		Mamifero.Binomio = "Ornithorhynchus anatinus";
		Mamifero.Habitat = "semiaquático";
		Mamifero.Embriao = "oviparo";
		Mamifero.Risco_de_Extincao = "quase ameaçado";
		
		System.out.println("De nome " + Mamifero.Nome + " e nome científico " + Mamifero.Binomio + ", vive em habitat " + Mamifero.Habitat + ", sendo um ser " + Mamifero.Embriao + " com o risco de estinção: " + Mamifero.Risco_de_Extincao + ".");
		
		Bovino bovino = new Bovino();
		
		bovino.Nome = "Boi(Touro)";
		bovino.Binomio = "Bos taurus";
		bovino.Habitat = "campestre";
		bovino.Embriao = "vivíparo";
		bovino.Risco_de_Extincao ="não avaliado";
		bovino.Tribo = "Bovine";
		bovino.Pelugem ="curta";
		bovino.Chifres = true;
		bovino.Domesticado = true;
		System.out.println("De nome " + bovino.Nome + " e nome científico " + bovino.Binomio + ", vive em habitat " + bovino.Habitat + ", sendo um ser " + bovino.Embriao + " com o risco de estinção: " + bovino.Risco_de_Extincao + ".");
		System.out.print("Da tribo " + bovino.Tribo + ", com pelagem " + bovino.Pelugem);
		if (bovino.Chifres == true) {
			System.out.print(", possui chifres");
		} else {
			System.out.print(", não possui chifres");
		}
		if (bovino.Domesticado == true) {
			System.out.print(", é domesticado pelo homem.");
		} else {
			System.out.print(", é silvestre.");
		}
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}