package empresa;

class Dolar extends Moeda {
    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public void info() { // definindo o método info na opção Dolar
        System.out.println("Dólar: " + this.valor);
    }

    @Override
    public double converter() { // definindo o método converter na opção Dolar
        return this.valor * 5; // Taxa de câmbio (1 Dolar == 5 Reais)
    }
}