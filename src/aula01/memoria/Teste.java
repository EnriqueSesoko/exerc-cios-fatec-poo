package aula01.memoria;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a,b,r;
		//onde 'a' � o primeiro n�mero, 'b' o segundo e 'r' o resultado da soma
		
		System.out.println("Digite um n�mero :");
		
		a = sc.nextDouble();
		
		System.out.println("Digite outro n�mero :");
		
		b = sc.nextDouble();
		
		r = (a + b);
		
		System.out.println("A soma � " +r);
		
	}

}
