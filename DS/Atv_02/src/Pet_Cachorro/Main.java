package Pet_Cachorro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro cachorro = new Cachorro();
		cachorro.nome = "Pluto";
		cachorro.raca = "Border Colie";
		cachorro.cor = "Preto e branco";
		cachorro.idade = 2;
		cachorro.tamanho = 1.30f;
		cachorro.comida = 15;
		cachorro.setFome(5);
		int Resultado = cachorro.Alimentar(cachorro.getFome(), cachorro.comida);
		
		String mensagem;
		if(Resultado < 10) {
			
			mensagem = "O cachorro está faminto";
			
		}
		
		else {
			
			mensagem = "O cachorro está saciado";
			
		}
		
		
		System.out.println("Dados do cachorro");
		System.out.println("Nome: " + cachorro.nome);
		System.out.println("Raça: " + cachorro.raca);
		System.out.println("Cor: " + cachorro.cor);
		System.out.println("Idade: " + cachorro.idade);
		System.out.println("Tamanho: " + cachorro.tamanho);
		System.out.println(mensagem);
	
	}

}
