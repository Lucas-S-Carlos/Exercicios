import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner (System.in);
		System.out.println("Digite um número inteiro: ");
		int num = leitor.nextInt();
		int i = 0;
		int valor = 0;
		while (i<11) {
			valor = num + i;
			tabuada(valor);
			i++;
		}
		leitor.close();
	}
	public static void tabuada(int valor) {
		for (int parcela = 0; parcela <= 10; parcela++) {
			int atual = valor * parcela;
			System.out.println (valor+" * "+ parcela + " = " + atual);
		}
	}
}