package aula01;

public class Carro {
	String modelo;
	String marca;
	String cor;
	Double valor;
	Double ipva;
	Integer ano;
	
	// metodo
	void calcIpva() {
		if(marca.equals("byd")) { // metodo equals() compara strings
			ipva = 0.0;
		}else if(marca.equals("chevrolet")) {
			ipva=valor*2/100;
		}else if (marca.equals("vw")) {
			ipva=valor*3/100;
		}else if (marca.equals("honda")) {
			ipva=valor*5/100;
		}else {
			ipva = valor*0.03;
		} // fim else
	} // fim metodo

} // fim classe
