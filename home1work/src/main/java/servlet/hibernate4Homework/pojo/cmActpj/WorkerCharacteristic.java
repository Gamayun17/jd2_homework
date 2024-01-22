package servlet.hibernate4Homework.pojo.cmActpj;

import javax.persistence.Column;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;

public class WorkerCharacteristic {

    @Column(name = "birth_date")
    private Date birthDate;
    @Column(name = "birth_place")
    private String birthPlace;
    @Column(name = "active_year")
    private Integer yearActive;

    public WorkerCharacteristic(Date birthDate, String birthPlace, Integer yearActive) {
        this.birthDate = birthDate;
        this.birthPlace = birthPlace;
        this.yearActive = yearActive;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public Integer getYearActive() {
        return yearActive;
    }

    public void setYearActive(Integer yearActive) {
        this.yearActive = yearActive;
    }
}
