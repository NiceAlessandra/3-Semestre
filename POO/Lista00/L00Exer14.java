/*
14) Escreva um programa em Java para gerar uma matriz quadrada L de 
* dimensão N. Imprimir os elementos da acima da diagonal secundária (inclusa).
 */

public class L00Exer14 {
	
	public static void main (String[] args) {
		
	int [][] l = new int [15][15]; 
	
		System.out.println ("Elementos da acima da diagonal secundaria (inclusa)");
	
		for (int i = 0 ; i < l.length ; i++ ){
			for (int j = 0 ; j < l.length ; j++ ){
				if (i + j <= l.length - 1){
					System.out.print (l[i][j] + " ");
				} else {
					System.out.print ("- ");
				}
			}
			System.out.println ();
		}
	}
}

