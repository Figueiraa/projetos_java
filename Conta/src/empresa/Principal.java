package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Conta c1 = new Conta("Mario",5000);
		Conta c2 = new Conta("Luigi",2000);
		
		
		try {
		
			c1.info();
			c1.depositar(300);
			c1.info();
			c1.sacar(800);
			c1.info();

		}
		catch(Exception e) {
			System.out.println("Problema: " + e.getMessage());
		}
		finally {
			System.out.println("Fechando o programa");
		}
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um valor para transferir:");
		double valorTransferir = teclado.nextDouble();
		boolean sucessoLeitura = false;
		
		while(!sucessoLeitura) {
		
			try {
	
				c1.transferir(valorTransferir, c2);
				c1.info();
				c2.info();
				sucessoLeitura=true;
			} catch (Exception e) {
				System.out.println("Ocorreu um problemas digite outro valor.");
				System.out.println(e.getMessage());
				System.out.println("Digite um valor para transferir:");
				valorTransferir = teclado.nextDouble();
			}
		}

	}
}
