package time.futebol;

public class Time extends PessoaJuridica {
	
	public Time (){
		
		super();
		
		setCNPJ(1);
		System.out.println(getCNPJ());
		
		setNomeCNPJ("Time A");
		System.out.println(getNomeCNPJ());
		
	}
	
	public void jogar () {
		
		System.out.println("O "+ getNomeCNPJ() +" está jogando ...");
		
	}

}
