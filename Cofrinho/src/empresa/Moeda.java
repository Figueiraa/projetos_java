package empresa;

abstract class Moeda {
    protected double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public abstract void info(); //criação do método info

    public abstract double converter(); //criação do método converter
}