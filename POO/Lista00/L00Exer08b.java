
/*
8) Escreva um programa em Java para gerar uma matriz F (N x M). Criar os vetores IMPAR e PAR com a quantidade de elementos (ímpares / pares) da matriz. Imprimir a matriz e os vetores. Validar para caso não haja uma das duas possibilidades (sem elementos pares ou ímpares).
*/

import java.util.Scanner;

public class L00Exer08b {
	
	public static void main (String[] args) {
		//criando as variaveis
		//int[][] matrizF; //vetor matriz
		//int[] impar, par; //vetores impar e par
		//int lin, col, contImpar, contPar, indImp, indPar; //variaveis que vao armazenar linha e coluna da matriz, que vao armazenar quantidade valores impares e pares na matriz, e variaveis que serao os indices dos vetores impar e par
		//boolean existePar = false, existeImpar = false; //variaveis que vao registrar se existe ou nao um valor impar ou par

		
		//lin = (int)(Math.random()*10+1);
		//col =  (int)(Math.random()*10+1);
		//contImpar = 0;
		//contPar = 0;
		//matrizF = new int[lin][col]; //definindo o tamanho da martiz
				
		//for (int i = 0; i < matrizF.length; i++){
		//	for(int j = 0; j < matrizF[i].length; j++){
		//		matrizF[i][j] = (int)(Math.random()*25); //atribuindo o valor aleatorio dentro da matriz, na posicao indicada por i e j
		//		if ((matrizF[i][j] % 2) == 0){ //confere se valor é par ou impar
		//			contPar++; //soma no contador se for par
		//		} else {
		//			contImpar++; //soma no contador se for impar
		//		}
		//	}
	//	}
		
		//if (contPar != 0){ //caso contador seja diferente de 0, significa que temos valores pares dentro da matriz
		//	contPar = contPar--; //menos 1 porque será usado como tamanho do vetor, e o vetor considera o numero zero
	//		ePar = true; //muda a variavel booleana para verdadeiro, indicando que existe numero par na matriz
	//	}
		//if (contImpar != 0){
		//	contImpar = contImpar--;
		//	eImpar = true;
	//	}
			
		//par = new int[contPar]; //usando as variaveis para definir o tamanho dos vetores
		//impar = new int[contImpar];
		
		//indImp = 0; //os indices dos vetores começando em 0
		//indPar = 0;
		
		//System.out.println("MATRIZ F: "); //imprime matriz
		//for (int i = 0; i < matrizF.length; i++){
		//	for(int j = 0; j < matrizF[i].length; j++){
				//System.out.print(matrizF[i][j]+"  " );
			//	if (matrizF[i][j] % 2 == 0){ //confere se valor da matriz é par ou impar
		//			par[indPar] = matrizF[i][j]; //caso seja par, atribui na posicao indicada no vetor par
		//			indPar++;
		//		} else { //se nao, atribui no vetor impar
		//			impar[indImp] = matrizF[i][j];
		//			indImp++;
		//		}
		//	}
		//	System.out.println();
		//}
		//System.out.println();
		
		if (ePar){ //se éPar for verdadeiro,imprime os valores atribuidos a ele na etapa anterior
			System.out.print("O valores pares da matriz F sao: ");
			for (int i = 0; i < par.length; i++){
				System.out.print(par[i]+"  " );
			}
			System.out.println();
		} else { //caso éPar nao seja verdadeiro, imprime mensagem de que nao foi encontrado valor par na matriz
			System.out.println("Nenhum valor par encontrado na matriz F." );
		}
		
		if (eImpar){ //mesmo processo anterior, mas para caso dos valores impares
			System.out.print("O valores impares da matriz F sao: ");
			for (int i = 0; i < impar.length; i++){
				System.out.print(impar[i]+"  " );
			}
			System.out.println();
		} else {
			System.out.println("Nenhum valor impar encontrado na matriz F." );
		}
			
	}
}
