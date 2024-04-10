package empresa;

public class LivroDigital extends Livro{
	public String linkDownload;
	public int tamanhoMB;
	
	public LivroDigital(String titulo, String autor, String linkDownload) {
		super(titulo,autor);
		this.linkDownload= linkDownload;
		
		
	}

	public float imposto() {
		//return 0.2f * lucro() + 2;
		return super.imposto() + 2;
	}
	
	public float tamanhoPorPagina() {
		return tamanhoMB/(float)paginas;
	}
	
	public void imprimirImposto() {
		System.out.println("Imposto livro Fisico: "  + super.imposto());
		System.out.println("Imposto livro Digital: " + this.imposto());
	}

}
