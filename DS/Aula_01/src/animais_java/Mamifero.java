package animais_java;

public class Mamifero {
	String nome_popular;
	String especie;
	int tempo_de_vida;
	String alimentacao;
	
	public Mamifero(String _nome, String _especie, int _tempo, String _alimentacao ) {
		this.nome_popular = _nome;
		this.especie = _especie;
		this.tempo_de_vida = _tempo;
		this.alimentacao = _alimentacao;
	}
}