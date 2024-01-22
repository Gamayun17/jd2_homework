package servlet.hibernate4Homework.dao.cmCha;

import servlet.hibernate4Homework.pojo.cmChapj.CharacterСharacteristic;
import servlet.hibernate4Homework.pojo.cmChapj.ShowCharacters;

public interface CriminalMindsCharactersDao {

    Integer create(ShowCharacters showCharacter);
    ShowCharacters read(int num);

    boolean update(int num, String nName, CharacterСharacteristic nCharacteristic);

    boolean delete(int num);
}
