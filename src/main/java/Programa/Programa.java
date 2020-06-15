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
        Transferencia transferencia1 = new Transferencia("Conta Felipe", "Conta Nelson", new BigDecimal(1000), LocalDate.of(2020, 06, 1));
        Transferencia transferencia2 = new Transferencia("Conta Felipe", "Conta Nelson", new BigDecimal(1000), LocalDate.of(2020, 06, 22));
        Transferencia transferencia3 = new Transferencia("Conta Felipe", "Conta Nelson", new BigDecimal(1000), LocalDate.of(2020, 06, 25));

        CalculaTaxasImpl calculaTaxas = new CalculaTaxasImpl();
        BigDecimal valorTotalTaxaA = calculaTaxas.caculaTaxa(Taxas.TAXA_A,transferencia.getValor(), transferencia.getData());
        BigDecimal valorTotalTaxaB = calculaTaxas.caculaTaxa(Taxas.TAXA_B,transferencia1.getValor(), transferencia1.getData());
        BigDecimal valorTotalTaxaC = calculaTaxas.caculaTaxa(Taxas.TAXA_C,transferencia2.getValor(), transferencia2.getData());
        BigDecimal valorTotalTaxaD = calculaTaxas.caculaTaxa(Taxas.TAXA_D,transferencia3.getValor(), transferencia3.getData());

        System.out.println(transferencia.getContaOrigem() + " " + " " + transferencia.getContaDestino() + " " + " " + transferencia.getValor() + " " + " " + "Valor total de taxas " + valorTotalTaxaA.floatValue());
        System.out.println(transferencia1.getContaOrigem() + " " + " " + transferencia1.getContaDestino() + " " + " " + transferencia1.getValor() + " " + " " + "Valor total de taxas " + valorTotalTaxaB.floatValue());
        System.out.println(transferencia2.getContaOrigem() + " " + " " + transferencia2.getContaDestino() + " " + " " + transferencia2.getValor() + " " + " " + "Valor total de taxas " + valorTotalTaxaC.floatValue());
        System.out.println(transferencia3.getContaOrigem() + " " + " " + transferencia3.getContaDestino() + " " + " " + transferencia3.getValor() + " " + " " + "Valor total de taxas " + valorTotalTaxaD.floatValue());

    }
}
