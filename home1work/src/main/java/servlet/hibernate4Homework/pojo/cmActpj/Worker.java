package servlet.hibernate4Homework.pojo.cmActpj;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "WORKER")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Worker {
    @Id
    @Column(name = "num")
    private Integer wNum;
    @Column(nullable = false, name ="name")
    private String wName;
    @Embedded
    private WorkerCharacteristic wCharacteristic;

    public Worker() {
    }

    public Worker(Integer wNum, String wName, WorkerCharacteristic wCharacteristic) {
        this.wNum = wNum;
        this.wName = wName;
        this.wCharacteristic = wCharacteristic;
    }

    public Integer getwNum() {
        return wNum;
    }

    public void setwNum(Integer wNum) {
        this.wNum = wNum;
    }

    public String getwName() {
        return wName;
    }

    public void setwName(String wName) {
        this.wName = wName;
    }

    public WorkerCharacteristic getwCharacteristic() {
        return wCharacteristic;
    }

    public void setwCharacteristic(WorkerCharacteristic wCharacteristic) {
        this.wCharacteristic = wCharacteristic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Worker worker = (Worker) o;

        if (!Objects.equals(wNum, worker.wNum)) return false;
        if (!Objects.equals(wName, worker.wName)) return false;
        return Objects.equals(wCharacteristic, worker.wCharacteristic);
    }

    @Override
    public int hashCode() {
        int result = wNum != null ? wNum.hashCode() : 0;
        result = 31 * result + (wName != null ? wName.hashCode() : 0);
        result = 31 * result + (wCharacteristic != null ? wCharacteristic.hashCode() : 0);
        return result;
    }
}
