/*
17) Escreva um programa em Java para gerar uma matriz quadrada Q de dimensão N.
Imprimir os elementos da acima da diagonal principal (inclusa) e abaixo da diagonal
secundária (inclusa).
 */

public class L00Exer17 {
	
	public static void main (String[] args) {
		
	int [][] q = new int [15][15];
	
	System.out.println ("Triangulo inferior");
	
		for(int i = 0 ; i < q.length ; i++){
			
			for (int j = 0 ; j < q[i].length ; j++){
				
				if (i >= j && i + j >= q.length - 1){
					System.out.print ( q[i][j] + " ");
				}else {
					System.out.print ("- ");
				}
				
			}
			System.out.println ();
		}
	}
}


