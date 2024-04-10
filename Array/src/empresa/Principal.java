package empresa;

import java.util.ArrayList;

public class Principal {

	
	public static int[] instanciaArray(int n) {
		return new int[n];
	}
	
	public static void main(String[] args) {
		
		int tam=10;
		
		int arr[];
		
		try {
			int conta = 10/0;
			arr = instanciaArray(tam);
			for(int i=0;i<tam;i++) {
				System.out.println(arr[i]);
			}

		}
		catch(NegativeArraySizeException e) {
			System.out.println("Valor invalido, digite outro");
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println("Impossivel dividir por zero");
		}
		
		
		
		
	}
}
