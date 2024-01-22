package servlet.hibernate4Homework.pojo.cmChapj;

public class VillianCharacter extends ShowCharacters {
    private Integer amountOfVictims;

    public VillianCharacter(Integer chNum, String chName, CharacterСharacteristic characterСharacteristic, Integer amountOfVictims) {
        super(chNum, chName, characterСharacteristic);
        this.amountOfVictims = amountOfVictims;
    }

    public Integer getAmountOfVictims() {
        return amountOfVictims;
    }

    public void setAmountOfVictims(Integer amountOfVictims) {
        this.amountOfVictims = amountOfVictims;
    }
}
