package servlet.springHomework.Fifteen.pojo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name= "T_SONG")
public class Song{
    @Id
    @GenericGenerator(strategy="uuid", name="song_uuid")
    @GeneratedValue(generator = "song_uuid")

    @Column(name="SONG_ID")
    private String id;
    @Column(name="SONG_TITLE")
    private String title;
    @Column(name="SONG_ARTISTNAME")
    private String artistName;
    @Column(name="SONG_ALBUMNAME")
    private String albumName;
    @Column(name="SONG_ARTISTLABEL")
    private String artistLabel;

    public Song(){}

    public Song(String id, String title, String artistName, String albumName, String artistLabel) {
        this.id = id;
        this.title = title;
        this.artistName = artistName;
        this.albumName = albumName;
        this.artistLabel = artistLabel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getArtistLabel() {
        return artistLabel;
    }

    public void setArtistLabel(String artistLabel) {
        this.artistLabel = artistLabel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Song song = (Song) o;

        if (!Objects.equals(id, song.id)) return false;
        if (!Objects.equals(title, song.title)) return false;
        if (!Objects.equals(artistName, song.artistName)) return false;
        if (!Objects.equals(albumName, song.albumName)) return false;
        return Objects.equals(artistLabel, song.artistLabel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artistName, artistLabel, albumName, artistLabel  );
    }
}
