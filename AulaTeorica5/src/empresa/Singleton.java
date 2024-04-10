package empresa;

public class Singleton {
	public int numero;
	private static Singleton instancia = null;
	
	private Singleton() {
		numero=20;
	}
	
	public static Singleton getInstance() {
		if(instancia == null) {
			instancia = new Singleton();
		}
		return instancia;
	}

}
