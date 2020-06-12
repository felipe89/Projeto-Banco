package Entidade;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

public class Transferencia {

    private String contaOrigem = "";
    private String contaDestino = "";
    private BigDecimal valor = BigDecimal.ZERO;
    private LocalDate data;

    public Transferencia(String contaOrigem, String contaDestino, BigDecimal valor, LocalDate data) {
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        this.valor = valor;
        this. data = data;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(String contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public String getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(String contaDestino) {
        this.contaDestino = contaDestino;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}


