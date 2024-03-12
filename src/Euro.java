
class Euro extends Moeda {

    // constroi a classe euro
    public Euro(String pais, double valor) {
        super(pais, valor);
    }

    // Acrescenta o método getNome
    @Override
    public String getNome() {
        return "Euro";
    }
}
