package servlet.hibernate4Homework.pojo.cmpj;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CRIMINAl_MINDS")
public class Cm extends Show {
    private Integer seasonAmount;
    private Boolean cancellation;


    public Cm() {
    }

    public Cm(String num, String title, ShowCharacteristic showCharacteristic, Integer seasonAmount, Boolean cancellation) {
        super(num, title, showCharacteristic);
        this.seasonAmount = seasonAmount;
        this.cancellation = cancellation;
    }

    public Integer getSeasonAmount() {
        return seasonAmount;
    }

    public void setSeasonAmount(Integer seasonAmount) {
        this.seasonAmount = seasonAmount;
    }

    public Boolean getCancellation() {
        return cancellation;
    }

    public void setCancellation(Boolean cancellation) {
        this.cancellation = cancellation;
    }
}




