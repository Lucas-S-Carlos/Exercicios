package animais_java;

public class Bovinos extends Mamifero {
	public boolean selvagem;
	public boolean chifres;
	String pelagem;
	
	public Bovinos(String _nome, String _especie, int _tempo, String _alimentacao, boolean _selvagem, boolean _chifres, String _pelagem) {
		super (_nome, _especie, _tempo, _alimentacao);
		this.selvagem = _selvagem;
		this.chifres = _chifres;
		this.pelagem = _pelagem;
	}
}