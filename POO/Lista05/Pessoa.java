/*
 * Pessoa.java
 * 
 */

public class Pessoa {
	
	private String nome;
	private int    idade;
	private double altura;
	
	public Pessoa () {
		
	}
	
	public void setNome ( String nome ) {
		
		if ( ! nome.isEmpty () ) {
			
			this.nome = nome;
		}
	}
	
	public void setIdade ( int idade ) {
		
		if ( idade >= 0 ) {
			
			this.idade = idade;
		}
	}
	
	public void setAltura ( double altura ) {
		
		if ( altura > 0 && altura <= 3.5 ) {
			
			this.altura = altura;
		}
	}
	
	public String getNome () {
		
		return nome;
	}
	
	public int getIdade () {
		
		return idade;
	}
	
	public double getAltura () {
		
		return altura;
	}
	
	public void fazAniversario ( boolean faz ) {
		
		if ( faz ) {
			
			idade++;
		}
	}
	
	@Override
	public String toString () {
		
		return "Nome..: " + nome + 
		       "\nIdade.: " + idade + 
		       "\nAltura: " + altura;
	}
}

