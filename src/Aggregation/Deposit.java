package Aggregation;
import java.math.BigDecimal;

public abstract class Deposit {

    public final BigDecimal amount;
    public final int period;

    Deposit(BigDecimal amount, int period) {
        this.amount = amount;
        this.period = period;
    }

    public BigDecimal getAmountOfCash(BigDecimal amount) {
        return amount;
    }

    public int getTimeOfDeposit(int period) {
        return period;
    }

    public abstract BigDecimal income();
}
