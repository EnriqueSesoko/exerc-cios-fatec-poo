package fedora;

public class Principe implements Nobre,Cavaleiro {
	
	@Override
	public void governar() {
		// TODO Auto-generated method stub
		System.out.println("Nobre -> governar()");
	}
	
	@Override
	public void duelar() {
		// TODO Auto-generated method stub
		System.out.println("Cavaleiro -> duelar()");
	}

}
