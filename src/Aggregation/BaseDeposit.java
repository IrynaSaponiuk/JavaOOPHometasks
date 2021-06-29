package Aggregation;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BaseDeposit extends Deposit {

    BigDecimal income;

    BaseDeposit(BigDecimal amount, int period) {
        super(amount, period);
    }

    @Override
    public BigDecimal income() {
        BigDecimal inc = amount;
        BigDecimal percent = BigDecimal.valueOf(0.05);
        int i = 0;
        for (i = 0; i < period; i++) {
            inc = inc.multiply(percent).add(inc);
        }
        income = inc.subtract(amount);
        return income.setScale(2, RoundingMode.HALF_EVEN);
    }

}
