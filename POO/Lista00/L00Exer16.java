/*
16) Escreva um programa em Java para gerar uma matriz quadrada P de 
* dimensão N. Imprimir os elementos da abaixo da diagonal principal (inclusa) e
abaixo da diagonal secundária (inclusa).
 */

public class L00Exer16 {
	
	public static void main (String[] args) {
		
	int [][] p = new int [15][15];
	
	System.out.println ("Triangulo esquerda");
	
		for(int i = 0 ; i < p.length ; i++){
			
			for (int j = 0 ; j < p[i].length ; j++){
				
				if (i >= j && i + j <= p.length - 1){
					System.out.print ( p[i][j] + " ");
				}else {
					System.out.print ("- ");
				}
				
			}
			System.out.println ();
		}
	
	System.out.println ("Triangulo direita");
	
		for(int i = 0 ; i < p.length ; i++){
			
			for (int j = 0 ; j < p[i].length ; j++){
				
				if (i <= j && i + j >= p.length - 1){
					System.out.print ( p[i][j] + " ");
				}else {
					System.out.print ("- ");
				}
				
			}
			System.out.println ();
		}
	}
}


