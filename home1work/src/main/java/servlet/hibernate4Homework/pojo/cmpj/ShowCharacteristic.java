package servlet.hibernate4Homework.pojo.cmpj;

import java.util.Date;

public class ShowCharacteristic {


    private String countryOrigin;
    private Date airingDate;

    public ShowCharacteristic(){}

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }

    public Date getAiringDate() {
        return airingDate;
    }

    public void setAiringDate(Date airingDate) {
        this.airingDate = airingDate;
    }

    public ShowCharacteristic(String countryOrigin, Date airingDate) {
        this.countryOrigin = countryOrigin;
        this.airingDate = airingDate;
    }
}

