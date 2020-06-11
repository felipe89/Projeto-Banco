package Programa;

import Entidade.Transferencia;

import java.math.BigDecimal;

public class Programa {
    public static void main(String[] args) {

        Transferencia transferencia = new Transferencia("Conta Felipe", "Conta Nelson", new BigDecimal(1000));
        transferencia.getContaDestino();
        transferencia.getContaOrigem();
        transferencia.getValor();

        realizaTransferencia(transferencia.getContaOrigem(),transferencia.getContaDestino(),transferencia.getValor());
    }

    private static void realizaTransferencia(String contaOrigem, String contaDestino, BigDecimal valor) {



    }
}
