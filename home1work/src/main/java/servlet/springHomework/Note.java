package servlet.springHomework;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Objects;

public class Note implements InitializingBean, DisposableBean {

    private String name;
    private String timename;
    private String accidentals;
    @Autowired
    @Qualifier("musicalSymbols")
    private MyMusicalSymbols musicalSymbols;

    public static Note getInstance() {
        return new Note();
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Note deleted");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Note created");

    }
    public void init() throws Exception {
        System.out.println("First note");
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Note note = (Note) o;

        if (!Objects.equals(name, note.name)) return false;
        if (!Objects.equals(timename, note.timename)) return false;
        if (!Objects.equals(accidentals, note.accidentals)) return false;
        return Objects.equals(musicalSymbols, note.musicalSymbols);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (timename != null ? timename.hashCode() : 0);
        result = 31 * result + (accidentals != null ? accidentals.hashCode() : 0);
        result = 31 * result + (musicalSymbols != null ? musicalSymbols.hashCode() : 0);
        return result;
    }
}






