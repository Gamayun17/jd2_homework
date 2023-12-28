package servlet.baseAndHinernateHomework.baseHomeworkTask7.pojo;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "expenses")
public class Expense implements Serializable {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "num")
   private  Integer num;
 @Column(name = "paydate")
  private  String paydate;
 @Column(name = "receiver")
   private Integer receiver;
 @Column(name = "value")
   private Double value ;

    public Expense() {
    }

    public Expense(Integer num, String paydate, Integer receiver, Double value) {
            this.num = num;
            this.paydate = paydate;
            this.receiver = receiver;
            this.value = value;
        }

    public Integer getNum() {
        return num;
    }

    public void setNum(int i) {
            this.num = num;
    }

    public String getPaydate() {
        return paydate;
    }

    public void setPaydate(String s) {
        this.paydate = paydate;
    }


    public Integer getReceiver() {
        return receiver;
    }
    public void setReceiver(int i) {
        this.receiver = receiver;
    }


    public Double getValue() {
        return value;
    }
    public void setValue(double v) {
        this.value = value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Expense expense = (Expense) o;

        if (!Objects.equals(num, expense.num)) return false;
        if (!Objects.equals(paydate, expense.paydate)) return false;
        if (!Objects.equals(receiver, expense.receiver)) return false;
        return Objects.equals(value, expense.value);
    }

    @Override
    public int hashCode() {
        int result = num != null ? num.hashCode() : 0;
        result = 31 * result + (paydate != null ? paydate.hashCode() : 0);
        result = 31 * result + (receiver != null ? receiver.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }

    @Override
        public String toString() {
            return "Expense{" +
                    "num=" + num+
                    ", paydate=" + paydate +
                    ", receiver=" + receiver +
                    ", value=" + value +
                    '}';
        }
}

//pojo