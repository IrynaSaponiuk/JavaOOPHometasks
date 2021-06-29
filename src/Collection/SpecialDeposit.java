package Collection;

import java.math.RoundingMode;
import java.math.BigDecimal;

public class SpecialDeposit extends Deposit implements Prolongable {

    protected BigDecimal incomeDeposit;

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
        incomeDeposit = inc.subtract(amount);
        return incomeDeposit.setScale(2, RoundingMode.HALF_EVEN);
    }



    public boolean canToProlong(){
        if (amount.compareTo(BigDecimal.valueOf(1000))>=1) return true;
        else return false;

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
