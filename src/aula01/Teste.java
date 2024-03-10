package aula01;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) { // main() : aonde ira testar os codigos
		// Criando os OBJETOS
		Carro c1 = new Carro();
		Carro c2 = new Carro();
		
		// CLASSE SCANNER
		Scanner into = new Scanner(System.in);
		
		
		// ENTRADA C1
		System.out.println("Carro 1 \n");
		System.out.println("Digite a marca: ");
		c1.marca=into.next(); // atribui marca ao objeto c1
		
		System.out.println("Digite o modelo: ");
		c1.modelo=into.next(); // atribui modelo ao objeto c1
		
		System.out.println("Digite a cor do carro: ");
		c1.cor=into.next(); // atribui cor ao objeto c1
		
		System.out.println("Digite o valor do carro: ");
		c1.valor=into.nextDouble(); // atribui valor ao objeto c1
		
		System.out.println("Digite o ano do carro: ");
		c1.ano=into.nextInt(); // atribui ano ao objeto c1
		
		c1.calcIpva(); // menssagem
		
		
		
		
		// ---------------
		// ENTRADA C2
		System.out.println("Carro 2");
		System.out.println("Digite a marca: ");
		c2.marca=into.next(); 
		
		System.out.println("Digite o modelo: ");
		c2.modelo=into.next(); 
		
		System.out.println("Digite a cor do carro: ");
		c2.cor=into.next();
		
		System.out.println("Digite o valor do carro: ");
		c2.valor=into.nextDouble(); 
		
		System.out.println("Digite o ano do carro: ");
		c2.ano=into.nextInt(); // 
		
		c2.calcIpva(); // 
		
		// ----------- SAIDAS
		
		System.out.println("O modelo: " + c1.modelo);
		System.out.println("A marca: " + c1.marca);
		System.out.println("O valor: R$ " + c1.valor);
		System.out.println("O valor do IPVA: R$ " + c1.ipva);
		
		System.out.println("\n\n O modelo: " + c2.modelo);
		System.out.println("A marca: " + c2.marca);
		System.out.println("O valor: R$ " + c2.valor);
		System.out.println("O valor do IPVA: R$ " + c2.ipva);
		

		 
		
		
	}

}
