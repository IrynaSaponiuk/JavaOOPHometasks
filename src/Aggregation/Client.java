package Aggregation;
import java.math.BigDecimal;

public class Client {

    private Deposit[] deposits;

    Client() {
        this.deposits = new Deposit[10];
    }

    public boolean addDeposit(Deposit deposit) {
        if (deposits == null) {
            throw new NullPointerException();
        }
        int i = 0;
        for (i = 0; i < deposits.length; i++) {
            if (deposits[i] == null) {
                deposits[i] = deposit;
                return true;
            }

        }
        return false;
    }

    public BigDecimal totalIncome() {
        BigDecimal totalIncome = BigDecimal.ZERO;
        int i = 0;
        for (i=0; i<deposits.length; i++) {
            if(deposits[i]==null){
                continue;
            }
            totalIncome = totalIncome.add(deposits[i].income());
        }
        return totalIncome;
    }

    public BigDecimal maxIncome() {
        if (deposits == null) {
            throw new NullPointerException();
        }
        BigDecimal maxIncome = deposits[0].income();
        int i=0;
        for (i=0;i<deposits.length;i++) {
            if (deposits[i]==null) continue;
            if (maxIncome.intValue()<=deposits[i].income().intValue()) {
                maxIncome = deposits[i].income();
            }
        }
        return maxIncome;
    }

    public BigDecimal getIncomeByNumber(int number) {
        BigDecimal result;
        if (number > 9 || number < 0) {
            return new BigDecimal(0);
        }
        if (deposits[number] == null) {
            return new BigDecimal(0);
        } else {
            result = deposits[number].income();
        }
        return result;
    }
}
