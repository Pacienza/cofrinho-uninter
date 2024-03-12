
class Real extends Moeda {

    // constroi a classe real
    public Real(String pais, double valor) {
        super(pais, valor);
    }

    // Acrescenta o método getNome
    @Override
    public String getNome() {
        return "Real";
    }
}
