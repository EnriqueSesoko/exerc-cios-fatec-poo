package time.futebol;

public class PessoaJuridica {
	private int CNPJ ;
	private String nomeCNPJ ;
	
	public PessoaJuridica(){
		
		super ();
		
		CNPJ = 0000000000000000 ;
		nomeCNPJ = "Nome invalido - CNPJ ";
	}
	

    public int getCNPJ() {
        return this.CNPJ;
    }
    
    public void setCNPJ(int valor){
        this.CNPJ = valor;
    }

    public String getNomeCNPJ() {
        return this.nomeCNPJ;
    }
    
    public void setNomeCNPJ(String valor) {
        this.nomeCNPJ = valor;
    }
	
}
