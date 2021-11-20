/*
20) Escreva um programa em Java para gerar uma matriz quadrada T de 
* dimensão N. Imprimir os elementos da ampulheta.
 */

public class L00Exer20 {
	
	public static void main (String[] args) {
		
	int [][] t = new int [15][15];
	
	System.out.println ("Ampulheta");
		for (int i = 0 ; i < t.length ; i++){
			for (int j = 0 ; j < t[i].length ; j++){
				
				if(i <= j && i + j <= t.length - 1 || 
				   i >= j && i + j >= t.length - 1 ){
					System.out.print (t[i][j] + " ");
				}else {
					System.out.print (". ");
				}
			}
			System.out.println();
		}
	
	
	}
}


