package tarefa.secretaria;

import java.util.Date;

public class Aluno {
	
	private long id;
	private Date nascimento;
	private String ra;
	private String nome;
	
	public Aluno(){
		
	}
	
	public void setId (long valor){
		
		this.id = valor;
	}
	
	public long getId (){
		
		return this.id;
	}
	public void setNascimento (Date valor){
		
		this.nascimento = valor;
	}
	
	public Date getNascimento (){
		
		return this.nascimento;
	}
	
	public void setRa (String valor){
		
		this.ra = valor;
	}
	
	public String getRa (){
		
		return this.ra;
	}
	
	public void setNome (String valor){
		
		this.nome = valor;
	}
	
	public String getNome (){
		
		return this.nome;
	}
	
}
