package empresa;

class Euro extends Moeda {
    public Euro(double valor) {
        super(valor);
    }

    @Override
    public void info() { // definindo o método info na opção Euro
        System.out.println("Euro: " + this.valor);
    }

    @Override
    public double converter() { // definindo o método converter na opção Euro
        return this.valor * 5.5; // Taxa de câmbio (1 Euro == 5,5 Reais)
    }
}