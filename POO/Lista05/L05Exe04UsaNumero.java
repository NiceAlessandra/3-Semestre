/*
4) Elabore um programa em java que contenha um método que aceite um valor inteiro e retorne o
número com os dígitos invertidos. O valor deve ser solicitado ao usuário
 * 
 */

import java.util.Scanner;

public class L05Exe04UsaNumero {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner ( System.in );
		
		Numero num = new Numero();
		
		int valor = 0;
		
		do {
			
			System.out.print("Entre com um numero: ");
			valor = leia.nextInt();
			
			if ( valor >= 0 ) {
			
				num.setNumero ( valor );
				
				System.out.println("O inverso do numero eh : " + 
												num.inverter() );
			}
			
		} while ( valor >= 0 );
		
		System.out.println("\n\tFim do programa!\n");
	}
}

