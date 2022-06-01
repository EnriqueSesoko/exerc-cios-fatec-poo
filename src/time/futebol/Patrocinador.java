package time.futebol;

public class Patrocinador extends PessoaJuridica {
	
	public Patrocinador () {
		
		super();
		
		setCNPJ(333);
		System.out.println(getCNPJ());
		
		setNomeCNPJ("Patrocinador A");
		
	}

}
