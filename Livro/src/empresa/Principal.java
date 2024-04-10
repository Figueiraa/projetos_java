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
		
		LivroDigital ld = new LivroDigital("Senhor dos Aneis",
				new Autor("Tolkien","Britanico","tolkien@email.com"),
				"Aventura",
				5,
				10000,
				3500);
		ld.info();

	}
}
