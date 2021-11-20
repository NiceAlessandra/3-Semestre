/*
1) Criar uma classe para representar uma Pessoa. A pessoa tem como características 
* o nome, em formato String, 
* a idade, em números inteiros e 
* a altura, que pode ter casas decimais. 
* Além dos métodos assessores de cada característica, temos um método que recebe como parâmetro de 
entrada um valor lógico, que quando verdadeiro, incrementa em um a idade da pessoa e esse 
método deve ser chamado por fazAniversario, não havendo retorno. Siga o diagrama abaixo para 
implementar a classe Pessoa. Após crie uma classe para testar. 
* Observe os sinais de mais e de menos antes dos nomes dos atributos e métodos. Respeite-os!
 */

import java.util.Scanner;

public class L05Exe01UsaPessoa {
	
	public static void main (String[] args) {
		
		Scanner leia    = new Scanner ( System.in );
		Scanner leiaStr = new Scanner ( System.in );
		
		Pessoa pessoa = new Pessoa ();
		
		int opcao = 0;
		
		String nome;
		int    idade;
		double altura;
		
		String resposta;
		
		do {
		
			System.out.println("\n=== MENU ===");
			System.out.println("1) Cadastrar pessoa");
			System.out.println("2) Mostrar pessoa");
			System.out.println("3) Faz aniversario?");
			System.out.println("4) Sair");
			System.out.println("----------------");
			System.out.print("Opcao: ");
			opcao = leia.nextInt();
			
			switch ( opcao ) {
				
				case 1:
					System.out.print("Nome..: ");
					nome = leiaStr.nextLine();
					
					System.out.print("Idade.: ");
					idade = leia.nextInt();
					
					System.out.print("Altura: ");
					altura = leia.nextDouble();
					
					System.out.print("\nDados corretos [S/N]: ");
					resposta = leiaStr.nextLine();
					
					if ( resposta.equalsIgnoreCase("s") ) {
					
						pessoa.setNome ( nome );
						pessoa.setIdade ( idade );
						pessoa.setAltura ( altura );
					}
					
					break;
				
				case 2:
					System.out.println( pessoa );
					
					break;
				
				case 3:
					System.out.print("Esta fazendo aniversario [S/N]: ");
					resposta = leiaStr.nextLine();
					
					pessoa.fazAniversario ( resposta.toUpperCase().charAt(0) == 'S' );
					
					break;
				
				case 4:
					System.out.println("\n\tFim do programa...\n");
					break;
				
				default:				
					System.out.println("\n\tOpcao invalida!\n");
			}

		} while ( opcao != 4 );
		
	}
}

