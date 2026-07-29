package model;

public class Cliente {
	
	    private int id;
	    private String titulo;
	    private String autor;
	    private String genero;
	    private String idioma;
	    private String quantidade;
	    private String preco;


	    public Cliente() {
	    }

	    public Cliente(String titulo, String autor, String genero, String idioma, String quantidade, String preco) {
	        this.titulo = titulo;
	        this.autor = autor;
	        this.genero = genero;
	        this.idioma = idioma;
	        this.quantidade = quantidade;
	        this.preco = preco;
	    }

	    public Cliente(int id, String titulo, String autor, String genero, String idioma, String quantidade, String preco) {
	        this.id = id;
	        this.titulo = titulo;
	        this.autor = autor;
	        this.genero = genero;
	        this.idioma = idioma;
	        this.quantidade = quantidade;
	        this.preco = preco;
	    }

	    public int getid() {
	        return id;
	    }

	    public void setid(int id) {
	        this.id = id;
	    }

	    public String gettitulo() {
	        return titulo;
	    }

	    public void settitulo(String titulo) {
	        this.titulo = titulo;
	    }

	    public String getautor() {
	        return autor;
	    }

	    public void setautor(String autor) {
	        this.autor = autor;
	    }

	    public String getgenero() {
	        return genero;
	    }

	    public void setgenero(String genero) {
	        this.genero = genero;
	    }
	    

	    public String getidioma() {
	        return idioma;
	    }

	    public void setidioma(String idioma) {
	        this.idioma = idioma;
	    }
	    

	    public String getquantidade() {
	        return quantidade;
	    }

	    public void setquantidade(String quantidade) {
	        this.quantidade = quantidade;
	    }
	    

	    public String getpreco() {
	        return preco.replace(",", ".");
	    }

	    public void setpreco(String preco) {
	        this.preco = preco.replace(",", ".");
	    }
	}


