package servlet.hibernate4Homework.pojo.cmpj;

import org.hibernate.annotations.Columns;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SHOW")
@Inheritance(strategy = InheritanceType.JOINED)
public class Show {
    @Id
    private String num;
    @Column
    private String title;
    @Embedded
    private ShowCharacteristic showCharacteristic;

    public Show() {}

    public Show(String num, String title, ShowCharacteristic showCharacteristic) {
        this.num = num;
        this.title = title;
        this.showCharacteristic = showCharacteristic;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ShowCharacteristic getShowCharacteristic() {
        return showCharacteristic;
    }

    public void setShowCharacteristic(ShowCharacteristic showCharacteristic) {
        this.showCharacteristic = showCharacteristic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Show show = (Show) o;

        if (!Objects.equals(num, show.num)) return false;
        if (!Objects.equals(title, show.title)) return false;
        return Objects.equals(showCharacteristic, show.showCharacteristic);
    }

    @Override
    public int hashCode() {
        int result = num != null ? num.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (showCharacteristic != null ? showCharacteristic.hashCode() : 0);
        return result;
    }
}
