package animais_java;

public class Main {

	public static void main(String[] args) {

		Mamifero gato = new Mamifero(
			"Gato",
			"Felis catus",
			15,
			"Carnívoro"
				);
		System.out.println("Animal 1 - Mamífero");
		System.out.println(gato.nome_popular);
		System.out.println(gato.especie);
		System.out.println("expectativa de vida aproximada de " + gato.tempo_de_vida + " anos");
		System.out.println(gato.alimentacao);
		System.out.println(" ");
		
		Bovinos iaque = new Bovinos(
				"Iaque",
				"Bos grunniens",
				20,
				"Herbívoro",
				false,
				true,
				"longa"
					);
		String mensagem1;
		if (iaque.selvagem == true) {
			mensagem1 = "É um animal selvagem";
		}
		else {
			mensagem1 = "É um animal doméstico";
		}
		String mensagem2;
		if (iaque.selvagem == true) {
			mensagem2 = "Possui chifres";
		}
		else {
			mensagem2 = "Não possui chifres";
		}
			System.out.println("Animal 2 - Bovinos");
			System.out.println(iaque.nome_popular);
			System.out.println(iaque.especie);
			System.out.println("expectativa de vida aproximada de " + iaque.tempo_de_vida + " anos");
			System.out.println(iaque.alimentacao);
			System.out.println(mensagem1);
			System.out.println(mensagem2);
			System.out.println("Pelagem " + iaque.pelagem);
	}
}