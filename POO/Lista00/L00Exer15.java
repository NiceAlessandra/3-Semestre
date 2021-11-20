/*
15) Escreva um programa em Java para gerar uma matriz quadrada O de dimensão N.
Imprimir os elementos da abaixo da diagonal principal (inclusa) e acima da diagonal
secundária (inclusa).
 */

public class L00Exer15 {
	
	public static void main (String[] args) {
		
	int [][] o = new int [15][15];
	
		System.out.println ("Xis");
		
			for (int i = 0 ; i < o.length ; i++){
				for (int j = 0 ; j < o[i].length ; j++){
					
					if (i == j || i + j == o.length - 1 ){
						
						System.out.print (o[i][j] + " ");
					} else {
						System.out.print ("- ");
					}
				}
			System.out.println ();	
			}
			
		System.out.println ("Nao Xis");	
		
			for (int i = 0 ; i < o.length ; i++){
				
				for (int j = 0 ; j < o.length ; j++){
					
					if (i == j || i + j == o.length -1){
						
						System.out.print ("- ");
					}else {
						System.out.print (o[i][j] + " ");
					}
				}
			System.out.println ();		
			} 
	
	}
}

