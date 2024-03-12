import java.util.ArrayList;
import java.util.List;

//gerencia as moedas
class Cofrinho {
    private List<Moeda> moedas;

    // Constroi a classe cofrinho
    public Cofrinho() {
        moedas = new ArrayList<>();
    }

    // adiciona moedas ao cofre
    public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
        System.out.println(moeda.getNome() + " adicionado(a) ao cofrinho.");
    }

    // remove determinada moeda do cofre
    public void removerMoeda(int indice) {
        if (indice >= 0 && indice < moedas.size()) {
            Moeda moedaRemovida = moedas.remove(indice);
            System.out.println(moedaRemovida.getNome() + " removido(a) do cofrinho.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    // Lista todas moedas no cofrinho
    public void listarMoedas() {
        if (moedas.isEmpty()) {
            System.out.println("O cofrinho está vazio.");
        } else {
            System.out.println("Moedas no cofrinho:");
            for (int i = 0; i < moedas.size(); i++) {
                System.out.println(i + ": " + moedas.get(i));
            }
        }
    }

    // calcula e converte o valor das moedas para Real
    public double calcularValorTotalEmReal() {
        double valorTotal = 0;
        for (Moeda moeda : moedas) {
            if (moeda instanceof Real) {
                valorTotal += moeda.getValor();
            } else if (moeda instanceof Dolar) {
                // valores aproximados da cotação atual da data da realização da atividade
                valorTotal += moeda.getValor() * 5;
            } else if (moeda instanceof Euro) {
                valorTotal += moeda.getValor() * 6;
            }
        }
        return valorTotal;
    }
}
