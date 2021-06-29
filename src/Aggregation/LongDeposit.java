package Aggregation;
import java.math.RoundingMode;
import java.math.BigDecimal;

public class LongDeposit extends Deposit {

    BigDecimal income;

    LongDeposit(BigDecimal amount, int period) {
        super(amount, period);
    }

    @Override
    public BigDecimal income() {
        BigDecimal inc = amount;
        BigDecimal percent = BigDecimal.valueOf(0.15);
        if (period <= 6) {
            return new BigDecimal(0);
        } else {
            int i = 0;
            for (i = 6; i < period; i++) {
                inc = inc.multiply(percent).add(inc);
            }
        }
        income = inc.subtract(amount);
        return income.setScale(2, RoundingMode.HALF_EVEN);
    }

}
