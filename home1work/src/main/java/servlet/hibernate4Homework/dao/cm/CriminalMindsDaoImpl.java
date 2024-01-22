package servlet.hibernate4Homework.dao.cm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import servlet.hibernate4Homework.pojo.cmActpj.Worker;
import servlet.hibernate4Homework.pojo.cmpj.Show;
import servlet.hibernate4Homework.pojo.cmpj.ShowCharacteristic;

public class CriminalMindsDaoImpl  implements CriminalMindsDao{

    private final SessionFactory sessionFactory;

    public CriminalMindsDaoImpl(SessionFactory sessionFactory) {
        if (sessionFactory == null) {
            throw new IllegalArgumentException("sessionFactory cannot be null");
        }
        this.sessionFactory = sessionFactory;
    }


    @Override
    public String create(Show show) {
        Transaction transaction = null;
        String saved = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            saved = (String) session.save(show);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            System.out.println("This show not saved");
        }
        System.out.println("Saved");
        return saved;
    }

    @Override
    public Show read(int num) {
        try
                (Session session = sessionFactory.openSession()) {
            return session.get(Show.class, num);
        }
    }

    @Override
    public boolean update(int num, String nTitle, ShowCharacteristic nCharacteristic) {
            Transaction transaction = null;
            try
                    (Session session = sessionFactory.openSession()) {
                transaction = session.beginTransaction();
                Show show = session.get(Show.class, num);
                if (show == null) return false;
                show.setTitle(nTitle);
                show.setShowCharacteristic(nCharacteristic);
                session.update(show);
            } catch (Exception e ){
                if ( transaction != null) transaction.rollback();
                System.out.println("Not updated");
                return false;
            }
            System.out.println("Updated");
            return true;
        }

    @Override
    public boolean delete(int num) {
        Transaction transaction = null;
        try
                (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            Show show = session.get(Show.class,  num);
            if (show == null) return false;
            session.remove(show);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            System.out.println("Not deleted");
            return false;
        }
        System.out.println("Deleted");
        return true;
    }

}
