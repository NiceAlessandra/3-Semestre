/*
 * Numero.java 
 * 
 */

public class Numero {
	
	private int numero;
	
	public Numero () {
		
		this.numero = 12;
	}
	
	public void setNumero ( int numero ) {
		
		if ( numero >= 0 ) {
			
			this.numero = numero;
		}
	}
	
	public int getNumero () {
		
		return numero;
	}
	
	public int inverter () {
		
		String numeroStr = "" + numero;
		
		String inverso = "";
		
		for ( int i = 0 ; i < numeroStr.length() ; i++ ) {
			
			inverso = numeroStr.charAt(i) + inverso;
		}
		
		return Integer.parseInt ( inverso );
	}
}

