/*
13) Escreva um programa em Java para gerar uma matriz quadrada K de dimensão N.
Imprimir os elementos da abaixo da diagonal secundária (exclusa).
 */

public class L00Exer13 {
	
	public static void main (String[] args) {
		
	int [][] k = new int [15][15];
	
	System.out.println ("Elementos da abaixo da diagonal secundaria (exclusa)");
	
		for (int i = 0 ; i < k.length ; i++){
			for (int j = 0 ; j < k.length ; j++ ){
				if (i + j > k.length - 1){ //>=inclusa diagonal secundaria
					System.out.print (k[i][j] + " ");
				} else {
					System.out.print ("- ");
				}
			}
		System.out.println();
		}
	}
}

