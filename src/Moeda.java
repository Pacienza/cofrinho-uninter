
// Classe mãe das outras moedas
abstract class Moeda {
    private String pais;
    private double valor;

    // Construtor da classe Moeda
    public Moeda(String pais, double valor) {
        this.pais = pais;
        this.valor = valor;
    }

    // Obtem o país da moeda
    public String getPais() {
        return pais;
    }

    // Obtem o valor da moeda
    public double getValor() {
        return valor;
    }

    // Obtem o nome da moeda apartir das informações inseridas nas classes herdeiras
    public abstract String getNome();

    // Constrói informações da moeda
    @Override
    public String toString() {
        return getNome() + " - " + getPais() + " (" + getValor() + ")";
    }
}
