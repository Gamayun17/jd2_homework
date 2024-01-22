package servlet.hibernate4Homework.pojo.cmChapj;

public class MainCharacter extends ShowCharacters {

    private Integer amountOfEpisodes;
    public MainCharacter(){}

    public MainCharacter(Integer chNum, String chName, CharacterСharacteristic characterСharacteristic, Integer amountOfEpisodes) {
        super(chNum, chName, characterСharacteristic);
        this.amountOfEpisodes = amountOfEpisodes;
    }

    public Integer getAmountOfEpisodes() {
        return amountOfEpisodes;
    }

    public void setAmountOfEpisodes(Integer amountOfEpisodes) {
        this.amountOfEpisodes = amountOfEpisodes;
    }
}
