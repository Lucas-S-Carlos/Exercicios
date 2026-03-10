import java.util.Scanner;

public class Main {
	
	static Scanner leitor = new Scanner(System.in);

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		boolean validador = true;
		
		while (validador == true) {
			
			System.out.println("\n===============================");
			System.out.println(" MENU:");
			System.out.println("===============================");
			
			System.out.println(" 1 - Cadastrar Aluno \n 2 - Cadastrar Professor \n 3 - Exibir Aluno \n 4 - Exibir Professor \n 0 - Sair" );
			int resposta = leitor.nextInt();
			leitor.nextLine();
			
			switch (resposta) {
			case 1:
				aluno = Cadastrar_Aluno(aluno);
				break;
			case 2:
				professor = Cadastrar_Professor(professor);
				break;
			case 3:
				Exibir_Aluno(aluno);
				break;
			case 4:
				Exibir_Professor(professor);
				break;
			case 0:
				System.out.println(" O programa foi finalizado.");
				validador = false;
			}
		}
	}

	public static Aluno Cadastrar_Aluno(Aluno aluno) {
		System.out.println("\n===============================");
		System.out.println(" Cadastro de alunos:");
		System.out.println("===============================");
		
		Boolean validador = true;
		
		
		while (validador == true) {
			System.out.println(" Insira o nome do aluno: " );
			String nome = leitor.nextLine().trim();
			
			if (nome != "") {
				aluno.setNome(nome);
				
				validador = false;
			} else {
				System.out.println(" Não deixe o nome vazio.");
			}
		}
		validador = true;
		
		while (validador == true) {
			System.out.println(" Insira a idade do aluno: ");
			int idade = leitor.nextInt();
			
			if (idade > 0 && idade <= 120) {
				aluno.setIdade(idade);
				
				validador = false;
			} else {
				System.out.println(" A idade deve ser positiva e de até 120 anos.");
			}
		}
		validador = true;
		leitor.nextLine();
		while (validador == true) {
			System.out.println(" Insira o número de matrícula do aluno: " );
			String matricula= leitor.nextLine().trim();
			
			if (matricula != "") {
				aluno.setMatricula(matricula);
				
				validador = false;
			} else {
				System.out.println(" Não deixe a matricula vazia.");
			}
		}					
		
		return aluno;
	}
	
	public static Professor Cadastrar_Professor(Professor professor) {
		System.out.println("\n===============================");
		System.out.println(" Cadastro de professores:");
		System.out.println("===============================");
		
		Boolean validador = true;
		
		
		while (validador == true) {
			System.out.println(" Insira o nome do professor: " );
			String nome = leitor.nextLine().trim();
			
			if (nome != "") {
				professor.setNome(nome);
				
				validador = false;
			} else {
				System.out.println(" Não deixe o nome vazio.");
			}
		}
		validador = true;
		
		while (validador == true) {
			System.out.println(" Insira a idade do professor: ");
			int idade = leitor.nextInt();
			
			if (idade > 0 && idade <= 120) {
				professor.setIdade(idade);
				
				validador = false;
			} else {
				System.out.println(" A idade deve ser positiva e de até 120 anos.");
			}
		}
		validador = true;
		leitor.nextLine();
		while (validador == true) {
			System.out.println(" Insira a diciplina do professor: " );
			String matricula= leitor.nextLine().trim();
			
			if (matricula != "") {
				professor.setDisciplina(matricula);
				
				validador = false;
			} else {
				System.out.println(" Não deixe a diciplina vazia.");
			}
		}		
		
		return professor;
	}
	
	private static void Exibir_Aluno(Aluno aluno) {
		
		System.out.println("\n===============================");
		System.out.println(" Os dados de aluno são:");
		System.out.println("===============================");
		System.out.println(" Nome:      "+ aluno.getNome());
		System.out.println(" Idade:     "+ aluno.getIdade());
		System.out.println(" Matrícula: "+ aluno.getMatricula());
		System.out.println("===============================\n");
		
		System.out.println(" Aperte ENTER para retornar ao menu.");
		leitor.nextLine();
		
	}
	
	private static void Exibir_Professor(Professor professor) {
		
		System.out.println("\n===============================");
		System.out.println(" Os dados de professor são:");
		System.out.println("===============================");
		System.out.println(" Nome:      "+ professor.getNome());
		System.out.println(" Idade:     "+ professor.getIdade());
		System.out.println(" Diciplina: "+ professor.getDisciplina());
		System.out.println("===============================\n");
		
		System.out.println(" Aperte ENTER para retornar ao menu.");
		leitor.nextLine();
		
	}

	

	

}

	