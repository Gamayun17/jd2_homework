package servlet.baseHomework.BaseHomeworkTask7;

import java.io.Serializable;
import java.util.Objects;

public class Reciever implements Serializable {



    private Integer num;
    private String name;



    public Reciever() {
        this.num = num;
        this.name = name;
    }

    public Integer getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = this.num;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = this.name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reciever reciever = (Reciever) o;

        if (!Objects.equals(num, reciever.num)) return false;
        return Objects.equals(name, reciever.name);
    }

    @Override
    public int hashCode() {
        int result = num != null ? num.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        return "Reciever{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}

//dto