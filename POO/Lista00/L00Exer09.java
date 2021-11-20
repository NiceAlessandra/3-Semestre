/*
9) Escreva um programa em Java para gerar uma matriz quadrada G de dimensão N.
Imprimir os elementos da diagonal principal (linha = coluna). 
 */

public class L00Exer09 {
	
	public static void main (String[] args) {
		
	int [][] g = new int [15][15];
	
		System.out.println("Diagonal Principal da Matriz G");
	
		for (int i = 0 ; i < g.length ; i++ ){
			for (int j = 0 ; j < g[i].length ; j++){
				if (i == j ){
					System.out.print (g[i][j] + " ");
				} else {
					System.out.print ("- ");
				}
			}
			System.out.println();
		}
	}
}

