/*
11) Escreva um programa em Java para gerar uma matriz quadrada K de dimensão N.
Imprimir os elementos da abaixo da diagonal principal (inclusa).
 */

public class L00Exer11 {
	
	public static void main (String[] args) {
		
	int [][] k = new int [15][15];
	
		System.out.println ("Elementos abaixo da diagonal principal");
		
			for (int i = 0 ; i < k.length ; i++){
				for (int j = 0 ; j< k[i].length ; j++){
					if (i >= j){
						System.out.print (k[i][j] + " ");
					}else {
						System.out.print ("- ");
					}
				}
				System.out.println();
			}
	}
}

