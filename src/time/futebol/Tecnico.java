package time.futebol;

public class Tecnico extends PessoaFisica {
	
	public Tecnico () {
		
		super ();
		
		setCPF(22);
		System.out.println(getCPF());
		
		setNomeCPF("Tecnico A");
		System.out.println(getNomeCPF());
		
	}
	
	public void mostrarTime (){
		
	}

}
