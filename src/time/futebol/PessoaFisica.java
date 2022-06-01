package time.futebol;

public class PessoaFisica {
	
	private int CPF ;
	private String nomeCPF ;
	
	public PessoaFisica(){
		
		super ();
		
		CPF = 0000 ;
		nomeCPF = "Nome invalido - CPF ";
	}
	

    public int getCPF() {
        return this.CPF;
    }
    
    public void setCPF(int valor){
        this.CPF = valor;
    }

    public String getNomeCPF() {
        return this.nomeCPF;
    }
    
    public void setNomeCPF(String valor) {
        this.nomeCPF = valor;
    }
	
}
