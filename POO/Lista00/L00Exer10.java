/*
10) Escreva um programa em Java para gerar uma matriz quadrada H de 
* dimensão N. Imprimir os elementos da diagonal secundária (linha + coluna =
dimensão + 1).
 */

public class L00Exer10 {
	
	public static void main (String[] args) {
		
	int [][] h = new int [15][15];
	
		System.out.println("Diagonal Secundaria da Matriz H");
	
		for (int i = 0 ; i < h.length ; i++ ){
			for (int j = 0 ; j < h[i].length ; j++){
				if (i + j == h[i].length - 1 ){
					System.out.print (h[i][j] + " ");
				} else {
					System.out.print ("- ");
				}
				
			}
			System.out.println();
		}
	
	
		
	
	

		
	}
}

