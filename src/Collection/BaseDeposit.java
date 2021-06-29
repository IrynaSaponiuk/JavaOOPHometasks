package Collection;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BaseDeposit extends Deposit implements Prolongable {

    protected BigDecimal incomeDeposit;

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
        incomeDeposit = inc.subtract(amount);
        return incomeDeposit.setScale(2, RoundingMode.HALF_EVEN);
    }

    public boolean canToProlong() {
        return false;
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
