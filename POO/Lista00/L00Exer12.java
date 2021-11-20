/*
12) Escreva um programa em Java para gerar uma matriz quadrada L de 
* dimensão N. Imprimir os elementos da acima da diagonal principal (exclusa).
 */

public class L00Exer12 {
	
	public static void main (String[] args) {
		
	int [][] l = new int [15][15];
	
	System.out.println ("Elementos acima da diagonal principal");
	
		for (int i = 0 ; i < l.length ; i++){
			for (int j = 0 ; j < l[i].length ; j++){
				if (i < j ){ // se <= diagonal principal será inclusa
					System.out.print (l[i][j] + " ");
				}else {
					System.out.print ("- ");
				}
			}
			System.out.println();
		}
	
	}
}

