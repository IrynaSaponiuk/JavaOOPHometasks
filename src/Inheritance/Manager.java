package Inheritance;
import java.math.BigDecimal;

public class Manager extends Employee {
    private int quantity;
    public Manager(String name, BigDecimal salary, int clientAmount){
        super(name, salary);
        this.quantity=clientAmount;
    }

    public int getClientAmount() {
        return quantity;
    }
    public void setClientAmount(int quantity){
        this.quantity=quantity;
    }
    @Override
    public void setBonus(BigDecimal bonus) {
        if (bonus!=null&&bonus.intValue()>0){
            if (this.quantity > 150) {
                this.bonus=bonus.add(BigDecimal.valueOf(1000));
            }
            else if (this.quantity > 100) {
                this.bonus=bonus.add(BigDecimal.valueOf(500));
            }

            else this.bonus=bonus;
        }
        else throw new IllegalArgumentException();
    }
}
