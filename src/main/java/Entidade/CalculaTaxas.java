package Entidade;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface CalculaTaxas {

    BigDecimal caculaTaxa(Taxas taxa, BigDecimal valor, LocalDate date);

}
