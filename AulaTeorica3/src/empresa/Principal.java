package empresa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Principal {

	public static void main(String[] args) {
		
		
	//Tema 2
		
		//Livro l1 = new Livro();
		
		//LivroDigital l2 = new LivroDigital();
		
	//Tema 3
		
		Livro l1 = new Livro("Sherlock Holmes","Sir Arthur Conan Doyle");
		
		
		LivroDigital l2 = new LivroDigital("Sherlock Holmes","Sir Arthur Conan Doyle","http://meusite/sherlock");
	
	//Tema 4
		
		System.out.println(l1 instanceof Livro);
		System.out.println(l2 instanceof Livro);
		System.out.println(l1 instanceof LivroDigital);
		System.out.println(l2 instanceof LivroDigital);

	}
}
