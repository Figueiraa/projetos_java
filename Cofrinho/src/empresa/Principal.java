package empresa;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();

        while (true) { //laço de repetição inicial com as opções do programa!
            System.out.println("MENU DO COFRINHO:");
            System.out.println("1 - Adicionar Moeda");
            System.out.println("2 - Remover Moeda");
            System.out.println("3 - Listar Moedas");
            System.out.println("4 - Calcular total convertido para Real");
            System.out.println("0 - Encerrar");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1: //caso 1 (Adicionar Moeda)
                    System.out.println("\n1- Dólar");
                    System.out.println("2- Euro");
                    System.out.println("3- Real");
                    System.out.print("Escolha uma moeda para adicionar: ");
                    int escolhaMoeda = scanner.nextInt();
                    System.out.print("Digite o valor da moeda: ");
                    double valor = scanner.nextDouble();
                    Moeda novaMoeda = null;
                    switch (escolhaMoeda) {
                        case 1: // caso 1 (escolher Dolar)
                            novaMoeda = new Dolar(valor);
                            break;
                        case 2: // caso 1 (escolher Euro)
                            novaMoeda = new Euro(valor);
                            break;
                        case 3: // caso 1 (escolher Real)
                            novaMoeda = new Real(valor);
                            break;
                        default: // caso default (escolheu uma opcão inválida)
                            System.out.println("Opção inválida!");
                            continue; // repete o switch
                    }
                    cofrinho.adicionar(novaMoeda);
                    System.out.println("Moeda adicionada com sucesso!");
                    break;
                case 2: //caso 2 (Remover Moeda)
                    System.out.print("Digite o valor da moeda a ser removida: ");
                    double valorRemover = scanner.nextDouble();
                    cofrinho.remover(valorRemover); // chama o método para remover da classe Cofrinho
                    break;
                case 3: //caso 3 (Listar Moedas)
                    cofrinho.listagemMoedas(); // chama o método para listar da classe Cofrinho
                    break;
                case 4: //caso 4 (Calcular total convertido para Real)
                    System.out.println("Total convertido no cofrinho: R$" + cofrinho.totalConvertido()); // chama o método para converter da classe Cofrinho
                    break;
                case 0: //caso 0 (Encerrar)
                    System.out.println("Encerando...");
                    scanner.close();
                    System.exit(0);
                    break;
                default: // caso default (escolheu uma opcão inválida)
                    System.out.println("Opção inválida!");
            }
        }
    }
}