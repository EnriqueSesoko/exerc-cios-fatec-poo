package aula01.memoria;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a,b,r;
		//onde 'a' é o primeiro número, 'b' o segundo e 'r' o resultado da soma
		
		System.out.println("Digite um número :");
		
		a = sc.nextDouble();
		
		System.out.println("Digite outro número :");
		
		b = sc.nextDouble();
		
		r = (a + b);
		
		System.out.println("A soma é " +r);
		
	}

}
