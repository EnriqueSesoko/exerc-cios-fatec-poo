package tarefa04;

public class Teste {
	
	public static void main(String[] args) {

// Instânciando Classe Carro, atribuindo valores e execultando os comportamentos		
		Carro c = new Carro();
		c.marca = "Chevrolet";
		c.modelo = "Prisma";
		
		c.Ligar();
		c.Acelerar();
		c.TrocarMarcha();
		
// Instânciando Classe Computador, atribuindo valores e execultando os comportamentos	
		Computador cp = new Computador();
		cp.cor = "Prata";
		cp.marca = "Apple";
		
		cp.Calcular();
		cp.Desligar();
		cp.Ligar();
		
// Instânciando Classe Ventilador, atribuindo valores e execultando os comportamentos		
		Ventilador v = new Ventilador();
		v.marca = "Mundial";
		v.modelo = "Turbo";
		
		v.Ligar();
		v.Desligar();
		v.TrocarVelocidade();
		
	}

}
