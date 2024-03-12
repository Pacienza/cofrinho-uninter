import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                exibirMenu();
                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        // Entrada de dados da moeda
                        System.out.println("Digite o nome da moeda: ");
                        String nome = scanner.next();
                        System.out.println("Digite o país da moeda: ");
                        String pais = scanner.next();
                        System.out.println("Digite o valor da moeda: ");
                        double valor = scanner.nextDouble();

                        // Verifica se a moeda é valida
                        if (nome.equalsIgnoreCase("Dólar")) {
                            cofrinho.adicionarMoeda(new Dolar(pais, valor));
                        } else if (nome.equalsIgnoreCase("Euro")) {
                            cofrinho.adicionarMoeda(new Euro(pais, valor));
                        } else if (nome.equalsIgnoreCase("Real")) {
                            cofrinho.adicionarMoeda(new Real(pais, valor));
                        } else {
                            System.out.println("Moeda inválida.");
                        }
                        break;

                    case 2:
                        cofrinho.listarMoedas();
                        System.out.println("Digite o identificador da moeda a ser removida: ");
                        int indice = scanner.nextInt();
                        cofrinho.removerMoeda(indice);
                        break;

                    case 3:
                        cofrinho.listarMoedas();
                        break;

                    case 4:
                        double valorTotalEmReal = cofrinho.calcularValorTotalEmReal();
                        System.out.println("O saldo em Reais é: " + valorTotalEmReal);
                        break;

                    case 5:
                        System.out.println("Encerrando o programa...");
                        System.exit(0);

                    default:
                        System.out.println("Opção inválida. Digite novamente.");
                }
            }
        }
    }

    // Exibe as Opções
    public static void exibirMenu() {
        System.out.println("\nMenu do Cofrinho Virtual:");
        System.out.println("1. Adicionar moedas");
        System.out.println("2. Remover moedas");
        System.out.println("3. Listar todas as moedas no cofre");
        System.out.println("4. Calcular saldo total em Reais");
        System.out.println("5. Sair");
        System.out.println("Escolha uma opção: ");
    }
}
