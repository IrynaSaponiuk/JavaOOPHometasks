package Collection;
import java.math.BigDecimal;

public abstract class Deposit implements Comparable <Deposit> {

    public final BigDecimal amount;
    public final int period;


    Deposit(BigDecimal amount, int period) {
        this.amount = amount;
        this.period = period;
    }

    private BigDecimal sumAmount() {
        return income().add(amount);
    }


    public BigDecimal getAmountOfCash(BigDecimal amount) {
        return amount;
    }

    public int getTimeOfDeposit(int period) {
        return period;
    }

    public abstract BigDecimal income();

    public abstract boolean canToProlong();

    @Override
    public int compareTo(Deposit obj){
        if (obj!=null){
            return this.sumAmount().compareTo(obj.sumAmount());
        }
        return 1;
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
