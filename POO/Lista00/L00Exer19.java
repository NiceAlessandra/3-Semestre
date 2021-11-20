/*
19) Escreva um programa em Java para gerar uma matriz quadrada S de dimensão N.
Imprimir os elementos da asa da borboleta.
 */

public class L00Exer19 {
	
	public static void main (String[] args) {
		
	int [][] s = new int [15][15];
	
	System.out.println ("Asa da borboleta");
		for (int i = 0 ; i < s.length ; i++){
			for (int j = 0 ; j < s[i].length ; j++){
				
				if(i >= j && i + j <= s.length - 1 || i <= j && i + j >= s.length - 1 ){
					System.out.print (s[i][j] + " ");
				}else {
					System.out.print (". ");
				}
			}
			System.out.println();
		}
	
	
	}
}


