package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		IngressoVip iv = new IngressoVip("Rock in Curitiba",200,100);
		iv.info();
		System.out.println("-------------");
		Ingresso i = new Ingresso("Rock in Rio Pardo",50);
		i.info();
		



	}
}
