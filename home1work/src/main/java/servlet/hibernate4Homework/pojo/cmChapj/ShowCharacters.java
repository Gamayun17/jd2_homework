package servlet.hibernate4Homework.pojo.cmChapj;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "SHOWCHARACTER")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class ShowCharacters {
    @Id
    @Column(name = "num")
    private Integer chNum;
    @Column(nullable = false,name = "name")
    private String chName;

    @Embedded
    private CharacterСharacteristic characterСharacteristic ;

    protected ShowCharacters() {}

    public ShowCharacters(Integer chNum, String chName, CharacterСharacteristic characterСharacteristic) {
        this.chNum = chNum;
        this.chName = chName;
        this.characterСharacteristic = characterСharacteristic;
    }

    public Integer getChNum() {
        return chNum;
    }

    public void setChNum(Integer chNum) {
        this.chNum = chNum;
    }

    public String getChName() {
        return chName;
    }

    public void setChName(String chName) {
        this.chName = chName;
    }

    public CharacterСharacteristic getCharacterСharacteristic() {
        return characterСharacteristic;
    }

    public void setCharacterСharacteristic(CharacterСharacteristic characterСharacteristic) {
        this.characterСharacteristic = characterСharacteristic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShowCharacters that = (ShowCharacters) o;

        if (!Objects.equals(chNum, that.chNum)) return false;
        if (!Objects.equals(chName, that.chName)) return false;
        return Objects.equals(characterСharacteristic, that.characterСharacteristic);
    }

    @Override
    public int hashCode() {
        int result = chNum != null ? chNum.hashCode() : 0;
        result = 31 * result + (chName != null ? chName.hashCode() : 0);
        result = 31 * result + (characterСharacteristic != null ? characterСharacteristic.hashCode() : 0);
        return result;
    }
}