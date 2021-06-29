package Aggregation;
import java.math.RoundingMode;
import java.math.BigDecimal;

public class SpecialDeposit extends Deposit {

    BigDecimal income;

    SpecialDeposit(BigDecimal amount, int period) {
        super(amount, period);
    }

    @Override
    public BigDecimal income() {
        BigDecimal inc = amount;
        int i = 0;
        for (i = 0; i < period; i++) {
            inc = inc.multiply(BigDecimal.valueOf(i+1).divide(BigDecimal.valueOf(100))).add(inc);
        }
        income = inc.subtract(amount);
        return income.setScale(2, RoundingMode.HALF_EVEN);
    }

}
