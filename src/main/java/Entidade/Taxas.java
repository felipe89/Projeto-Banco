package Entidade;

public enum Taxas {

    TAXA_A("A"),
    TAXA_B("B"),
    TAXA_C("C"),
    TAXA_D("D");
    public String descricao;

    Taxas(String taxa) {
        descricao = taxa;
    }
}
