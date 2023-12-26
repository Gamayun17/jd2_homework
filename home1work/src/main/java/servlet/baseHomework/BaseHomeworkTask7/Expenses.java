package servlet.baseHomework.BaseHomeworkTask7;

import java.io.Serializable;
import java.util.Objects;

public class Expenses implements Serializable {

   private  Integer num;
  private  String paydate;
   private Integer receiver;
   private Double value ;

        public Expenses(Integer num, String paydate, Integer receiver, Double value) {
            this.num = num;
            this.paydate = paydate;
            this.receiver = receiver;
            this.value = value;
        }

    public Integer getNum() {
        return num;
    }

    public void setNum() {
            this.num = num;
    }

    public String getPaydate() {
        return paydate;
    }

    public void setPaydate() {
        this.paydate = paydate;
    }


    public Integer getReceiver() {
        return receiver;
    }
    public void setReceiver() {
        this.receiver = receiver;
    }


    public Double getValue() {
        return value;
    }
    public void setValue() {
        this.value = value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Expenses expenses = (Expenses) o;

        if (!Objects.equals(num, expenses.num)) return false;
        if (!Objects.equals(paydate, expenses.paydate)) return false;
        if (!Objects.equals(receiver, expenses.receiver)) return false;
        return Objects.equals(value, expenses.value);
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
            return "Expenses{" +
                    "num=" + num+
                    ", paydate=" + paydate +
                    ", receiver=" + receiver +
                    ", value=" + value +
                    '}';
        }
}