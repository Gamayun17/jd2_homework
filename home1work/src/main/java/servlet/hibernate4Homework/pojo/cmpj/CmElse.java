package servlet.hibernate4Homework.pojo.cmpj;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="CRIMINAl_MINDS_GAME")
public class CmElse extends Show{
    private String developer;
    private String platform;

    public CmElse() {}

    public CmElse(String num, String title, ShowCharacteristic showCharacteristic, String developer, String platform) {
        super(num, title, showCharacteristic);
        this.developer = developer;
        this.platform = platform;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}
