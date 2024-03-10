package aula01;

import java.util.Scanner;

public class Teste_pessoa {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Digite o nome da pessoa: ");
		p.nome=in.next();
		
		System.out.println("Digite a idade da pessoa: ");
		p.idade=in.nextInt();
		
		System.out.println("Digite nome da pessoa: ");
		p.salario=in.nextDouble();
		
		System.out.println("O nome da pessoa: " + p.nome);
		System.out.println("Idade da pessoa: " + p.idade);
		System.out.println("O salario da pessoa: " + p.salario);
		
		
		
	}	
}
