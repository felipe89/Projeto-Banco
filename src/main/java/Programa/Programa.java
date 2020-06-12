package Programa;

import Entidade.CalculaTaxas;
import Entidade.CalculaTaxasImpl;
import Entidade.Taxas;
import Entidade.Transferencia;
import sun.util.calendar.BaseCalendar;
import sun.util.calendar.LocalGregorianCalendar;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

public class Programa {
    public static void main(String[] args) {

        realizaTransferencia();
    }

    private static void realizaTransferencia() {

        Transferencia transferencia = new Transferencia("Conta Felipe", "Conta Nelson", new BigDecimal(1000), LocalDate.now());
        Transferencia transferencia1 = new Transferencia("Conta Felipe", "Conta Nelson", new BigDecimal(1000), LocalDate.now());

        CalculaTaxasImpl calculaTaxas = new CalculaTaxasImpl();
        BigDecimal valorTotalTaxaA = calculaTaxas.caculaTaxa(Taxas.TAXA_A,transferencia.getValor(), transferencia.getData());
        BigDecimal valorTotalTaxaB = calculaTaxas.caculaTaxa(Taxas.TAXA_B,transferencia1.getValor(), transferencia1.getData());

        System.out.println(transferencia.getContaOrigem() + " " + " " + transferencia.getContaDestino() + " " + " " + transferencia.getValor() + " " + " " + "Valor total de taxas " + valorTotalTaxaA);
        System.out.println(transferencia1.getContaOrigem() + " " + " " + transferencia1.getContaDestino() + " " + " " + transferencia1.getValor() + " " + " " + "Valor total de taxas " + valorTotalTaxaB);

    }
}
