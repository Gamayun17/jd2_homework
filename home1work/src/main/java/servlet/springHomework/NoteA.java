package servlet.springHomework;

import org.springframework.beans.factory.annotation.Value;

public class NoteA {
    @Value("${noteA.name}")
    private String name;
    @Value("${noteA.timename}")
    private String timename;
    @Value("${noteA.accidentals}")
    private String accidentals;

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
}
