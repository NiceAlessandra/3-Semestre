/*
18) Escreva um programa em Java para gerar uma matriz quadrada R de 
* dimensão N. Imprimir os elementos da acima da diagonal principal (inclusa) e
acima da diagonal secundária (inclusa).
 */

public class L00Exer18 {
	
	public static void main (String[] args) {
		
	int [][] r = new int [15][15];
	
	System.out.println ("Triangulo superior");
	
		for(int i = 0 ; i < r.length ; i++){
			
			for (int j = 0 ; j < r[i].length ; j++){
				
				if (i <= j && i + j <= r.length - 1){
					System.out.print ( r[i][j] + " ");
				}else {
					System.out.print ("- ");
				}
				
			}
			System.out.println ();
		}
	}
}


