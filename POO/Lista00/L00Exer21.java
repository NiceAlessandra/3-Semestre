/*
21) Escreva um programa em Java para gerar uma matriz (N x M) e outra (N x P). 
* Gerar uma terceira matriz (N x (M+P)), sendo que para cada linha 
* concatenar suas respectivas colunas e apresentar as três matrizes.
 */

public class L00Exer21 {
	
	public static void main (String[] args) {
		
	int [][] a = new int [5][5];
	int [][] b = new int [10][10];
	int [][] c = new int [5][15];
	
	System.out.println ("Matriz A: ");
	
		for (int i = 0 ; i < a.length ; i++) {
			for (int j = 0; j < a[i].length ; j++){
				
				System.out.print (a[i][j] + " ");
			}
			System.out.println ();
		}
	}
	
	System.out.println("Matriz B:");
	
		for (int i = 0 ; i < b.length ; i++){
			for (int j = 0 ; j < b[i].length ; j++ ){
				
				System.out.print ( b[i][j] + " ");
			
			}
			System.out.println ();
		}
}


