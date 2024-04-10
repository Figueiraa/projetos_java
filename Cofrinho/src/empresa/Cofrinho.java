package empresa;

import java.util.ArrayList;

class Cofrinho {
    private ArrayList<Moeda> listaMoedas; // Criação da lista de moedas

    public Cofrinho() {
        listaMoedas = new ArrayList<>();
    }

    public void adicionar(Moeda moeda) { // método para adicionar a moeda
        listaMoedas.add(moeda);
    }

    public void remover(double valor) { // método para remover a moeda
        Moeda moedaRemovida = null;
        for (Moeda moeda : listaMoedas) {
            if (moeda.valor == valor) {
                moedaRemovida = moeda;
                break;
            }
        }
        if (moedaRemovida != null) {
            listaMoedas.remove(moedaRemovida);
            System.out.println("Moeda removida com sucesso!");
        } else {
            System.out.println("Moeda não encontrada!");
        }
    }

    public void listagemMoedas() { // método para listar as moedas
        System.out.println("Moedas no cofrinho:");
        for (Moeda moeda : listaMoedas) {
            moeda.info(); // chama o método info da classe moeda
        }
    }

    public double totalConvertido() { // método para converter a moeda
        double total = 0;
        for (Moeda moeda : listaMoedas) {
            total += moeda.converter(); // chama o método converter da classe moeda
        }
        return total;
    }
}