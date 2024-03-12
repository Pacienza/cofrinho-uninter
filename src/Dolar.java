
class Dolar extends Moeda {

    // Constroi a classe dólar
    public Dolar(String pais, double valor) {
        super(pais, valor);
    }

    // Acrescenta o método getNome
    @Override
    public String getNome() {
        return "Dólar";
    }
}
