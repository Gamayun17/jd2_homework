package servlet.hibernate4Homework.dao.cmCha;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import servlet.hibernate4Homework.pojo.cmChapj.CharacterСharacteristic;
import servlet.hibernate4Homework.pojo.cmChapj.ShowCharacters;

public class CriminalMindsCharactersDaoImpl implements CriminalMindsCharactersDao {
    private final SessionFactory sessionFactory;

    public CriminalMindsCharactersDaoImpl(SessionFactory sessionFactory) {
        if (sessionFactory == null) {
            throw new IllegalArgumentException("sessionFactory cannot be null");
        }
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Integer create(ShowCharacters showCharacters) {
        Transaction transaction = null;
        Integer saved = null;
        try
                (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            saved = (Integer) session.save(showCharacters);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            System.out.println("This show character not saved");
        }
        System.out.println("Show character saved");
        return saved;
    }

    @Override
    public ShowCharacters read(int num) {
        try
                (Session session = sessionFactory.openSession()) {
            return session.get(ShowCharacters.class, num);
        }
    }

    @Override
    public boolean update(int num, String nName, CharacterСharacteristic nCharacteristic) {
        Transaction transaction = null;
        try
                (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            ShowCharacters showCharacters = session.get(ShowCharacters.class, num);
            if (showCharacters == null) return false;
            showCharacters.setChName(nName);
            showCharacters.setCharacterСharacteristic(nCharacteristic);
            session.update(showCharacters);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            System.out.println("This show character not updated");
            return false;
        }
        System.out.println("Show character saved");
        return true;
    }

    @Override
    public boolean delete(int num) {
        Transaction transaction = null;
        try
                (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            ShowCharacters showCharacters = session.get(ShowCharacters.class, num);
            if (showCharacters == null) return false;
            session.remove(showCharacters);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            System.out.println("This show character not deleted");
            return false;
        }
        System.out.println("Deleted");
        return true;
    }

}