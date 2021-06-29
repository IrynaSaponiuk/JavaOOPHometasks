package Inheritance;
import java.math.BigDecimal;

abstract public class Employee {
    private String name;
    private BigDecimal salary;
    protected BigDecimal bonus;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setSalary(BigDecimal salary){
        if (salary.intValue()>0){
            this.salary=salary;
        }
        else throw new IllegalArgumentException();
    }

    public BigDecimal getSalary(){
        return salary;
    }

    Employee(String name, BigDecimal salary){
        this.name=name;
        this.salary=salary;
    }

    public BigDecimal getBonus(){
        return bonus;
    }
    abstract public void setBonus(BigDecimal bonus);

    public BigDecimal toPay(){
        if (bonus!=null&&bonus.intValue()>0){
            return salary.add(bonus);
        }
        else throw new IllegalArgumentException();
    }
}
