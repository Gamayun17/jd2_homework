package servlet.springHomework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NoteE {
    @Value("${noteE.name}")
    private String name;
    @Value("${noteE.timename}")
    private String timename;
    @Value("${noteE.accidentals}")
    private String accidentals;
    @Autowired
    @Qualifier("musicalSymbols2")
    private MyMusicalSymbols musicalSymbols;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimename() {
        return timename;
    }

    public void setTimename(String timename) {
        this.timename = timename;
    }

    public String getAccidentals() {
        return accidentals;
    }

    public void setAccidentals(String accidentals) {
        this.accidentals = accidentals;
    }

    public MyMusicalSymbols getMusicalSymbols() {
        return musicalSymbols;
    }

    public void setMusicalSymbols(MyMusicalSymbols musicalSymbols) {
        this.musicalSymbols = musicalSymbols;
    }
}

