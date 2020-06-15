package Entidade;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CalculaTaxasImpl implements CalculaTaxas {


    public BigDecimal caculaTaxa(Taxas taxa, BigDecimal valor, LocalDate dataTransferencia) {
        BigDecimal valorTotalTaxa = BigDecimal.ZERO;
        LocalDate dataCadastro = LocalDate.now();

        if (taxa.descricao.equals("A")) {
            BigDecimal valorTaxa = new BigDecimal(2.00);
            BigDecimal porcentagem = new BigDecimal(3.0);

            valorTotalTaxa = porcentagem.divide(new BigDecimal(100)).multiply(valor).add(valorTaxa);
        }
        else if (taxa.descricao.equals("B")) {
            BigDecimal valorDentroPeriodo = new BigDecimal(10.0);
            BigDecimal valorForaPeriodo = new BigDecimal(8.00);

            long dias = ChronoUnit.DAYS.between(dataCadastro, dataTransferencia);

            if (dias <= 30) {
                valorTotalTaxa = new BigDecimal(10.0);
            }
            else {
                valorTotalTaxa = new BigDecimal(8.00);
            }
        }
        else if (taxa.descricao.equals("C")){
            BigDecimal porcentagemAcima30 = new BigDecimal(1.2);
            BigDecimal porcentagemAte30 = new BigDecimal(2.1);
            BigDecimal porcentagemAte25 = new BigDecimal(4.3);
            BigDecimal porcentagemAte20 = new BigDecimal(5.4);
            BigDecimal porcentagemAte15 = new BigDecimal(6.7);
            BigDecimal porcentagemAte10 = new BigDecimal(7.4);
            BigDecimal porcentagemAte5 = new BigDecimal(8.3);

            long dias = ChronoUnit.DAYS.between(dataCadastro, dataTransferencia);

            if (dias <= 5) {
                valorTotalTaxa = porcentagemAte5.divide(new BigDecimal(100)).multiply(valor);
            }
            else if (dias <= 10){
                valorTotalTaxa = porcentagemAte10.divide(new BigDecimal(100)).multiply(valor);
            }
            else if (dias <= 15){
                valorTotalTaxa = porcentagemAte15.divide(new BigDecimal(100)).multiply(valor);
            }
            else if (dias <= 20){
                valorTotalTaxa = porcentagemAte20.divide(new BigDecimal(100)).multiply(valor);
            }
            else if (dias <= 25){
                valorTotalTaxa = porcentagemAte25.divide(new BigDecimal(100)).multiply(valor);
            }
            else if (dias <= 30){
                valorTotalTaxa = porcentagemAte30.divide(new BigDecimal(100)).multiply(valor);
            }
            else if (dias > 30){
                valorTotalTaxa = porcentagemAcima30.divide(new BigDecimal(100)).multiply(valor);
            }
        }
        return valorTotalTaxa;
    }
}



