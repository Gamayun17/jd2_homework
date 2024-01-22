package servlet.hibernate4Homework.pojo.cmActpj;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCER")

public class Producer extends Worker {
    private Integer showCredits;
    private Integer firstCmep;

    public Producer(){}

    public Producer(Integer wNum, String wName, WorkerCharacteristic wCharacteristic, Integer showCredits, Integer firstCmep) {
        super(wNum, wName, wCharacteristic);
        this.showCredits = showCredits;
        this.firstCmep = firstCmep;
    }

    public Integer getShowCredits() {
        return showCredits;
    }

    public void setShowCredits(Integer showCredits) {
        this.showCredits = showCredits;
    }

    public Integer getFirstCmep() {
        return firstCmep;
    }

    public void setFirstCmep(Integer firstCmep) {
        this.firstCmep = firstCmep;
    }
}
