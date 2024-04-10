package empresa;

class Real extends Moeda {
    public Real(double valor) {
        super(valor);
    }

    @Override
    public void info() { // definindo o método info na opção Real
        System.out.println("Real: " + this.valor);
    }

    @Override
    public double converter() { // definindo o método converter na opção Real
        return this.valor;
    }
}