package servlet.springHomework;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicalSymbols2 implements MyMusicalSymbols{
    @Value("${noteE.articulationMark")
    private String articulationMark;
    @Value("${noteE.ornament}")
    private String ornament;

    public String getArticulationMark() {
        return articulationMark;
    }

    public void setArticulationMark(String articulationMark) {
        this.articulationMark = articulationMark;
    }

    public String getOrnament() {
        return ornament;
    }

    public void setOrnament(String ornament) {
        this.ornament = ornament;
    }
}
