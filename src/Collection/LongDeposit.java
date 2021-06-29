package Collection;

import java.math.RoundingMode;
import java.math.BigDecimal;

public class LongDeposit extends Deposit {

    protected BigDecimal incomeDeposit;

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
        incomeDeposit = inc.subtract(amount);
        return incomeDeposit.setScale(2, RoundingMode.HALF_EVEN);
    }


    public boolean canToProlong() {
        if (period < 36) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
