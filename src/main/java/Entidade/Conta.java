package Entidade;

public class Conta {

    public String nome;
    int numeroConta;
    double valor;

    public Conta(String nome, int numeroConta, double valor) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
