package Entidade;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CalculaTaxasImpl implements CalculaTaxas {


    public BigDecimal caculaTaxa(Taxas taxa, BigDecimal valor, LocalDate date) {
        BigDecimal valorTotalTaxa = BigDecimal.ZERO;

        if (taxa.descricao.equals("A")) {
            BigDecimal valorTaxa = new BigDecimal(2.00);
            BigDecimal porcentagem = new BigDecimal(3.0);

            valorTotalTaxa = porcentagem.divide(new BigDecimal(100)).multiply(valor).add(valorTaxa);

        }else if (taxa.descricao.equals("B")){
            BigDecimal valorDentroPeriodo = new BigDecimal(10.0);
            BigDecimal valorForaPeriodo = new BigDecimal(8.00);
            LocalDate dataCadastro = LocalDate.of(2020, 06, 1);

        }

        return valorTotalTaxa;
    }
}
