package servlet.hibernate4Homework.dao.cm;

import servlet.hibernate4Homework.pojo.cmpj.Show;
import servlet.hibernate4Homework.pojo.cmpj.ShowCharacteristic;

public interface CriminalMindsDao {
    String create(Show show);
    Show read( int num);
    boolean update(int num, String nTitle, ShowCharacteristic nCharacteristic);

    boolean delete(int num);
}
