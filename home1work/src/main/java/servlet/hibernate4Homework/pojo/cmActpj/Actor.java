package servlet.hibernate4Homework.pojo.cmActpj;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ACTOR")
public class Actor extends Worker{

    private String showCharacter;
    private Integer filmographyAmount;

    public String getShowCharacter() {
        return showCharacter;
    }

    public void setShowCharacter(String showCharacter) {
        this.showCharacter = showCharacter;
    }

    public Integer getFilmographyAmount() {
        return filmographyAmount;
    }

    public void setFilmographyAmount(Integer filmographyAmount) {
        this.filmographyAmount = filmographyAmount;
    }


    public Actor(){}


    public Actor(Integer wNum, String wName, WorkerCharacteristic wCharacteristic, String showCharacter, Integer filmographyAmount) {
        super(wNum, wName, wCharacteristic);
        this.showCharacter = showCharacter;
        this.filmographyAmount = filmographyAmount;
    }
}
