package teoria.usothis;

public class Aluno {
	
	int nota ;
	
	public Aluno (){
		
		this.nota = 5 ;
				
	}
	
	public void setNota (int nota) {
		
		System.out.println("Valores iniciais");
		System.out.println("parâmetro nota  " +nota);
		System.out.println("construtor nota  " +this.nota);
		
		nota = nota ;
		
		System.out.println("Valores após : nota = nota");
		System.out.println("parâmetro nota  " +nota);
		System.out.println("construtor nota  " +this.nota);
		
		this.nota = nota ;
		
		System.out.println("Valores após : this.nota = nota");
		System.out.println("parâmetro nota  " +nota);
		System.out.println("construtor nota  " +this.nota);
		
	}
	
	public int getNota () {
		
		return nota;	
	}

}
