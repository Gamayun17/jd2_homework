package servlet.hibernate4Homework.dao.cmAct;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import servlet.hibernate4Homework.pojo.cmActpj.Worker;
import servlet.hibernate4Homework.pojo.cmActpj.WorkerCharacteristic;

public class CriminalMindsWorkersDaoImpl implements CriminalMindsWorkersDao {
    private final SessionFactory sessionFactory;

    public CriminalMindsWorkersDaoImpl(SessionFactory sessionFactory) {
        if (sessionFactory == null) {
            throw new IllegalArgumentException("sessionFactory cannot be null");
        }
        this.sessionFactory = sessionFactory;
    }

    @Override
    public String create(Worker worker) {
        Transaction transaction = null;
        String saved = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            saved = (String) session.save(worker);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            System.out.println("This worker not saved");
        }
        System.out.println("Saved");
        return saved;
    }

    @Override
    public Worker read(int num) {
        try
                (Session session = sessionFactory.openSession()) {
            return session.get(Worker.class, num);
    }
    }

    @Override
    public boolean update(int num, String nName, WorkerCharacteristic nCharacteristic) {
            Transaction transaction = null;
            try
                    (Session session = sessionFactory.openSession()) {
                transaction = session.beginTransaction();
                Worker worker = session.get(Worker.class, num);
                if (worker == null) return false;
                worker.setwName(nName);
                worker.setwCharacteristic(nCharacteristic);
                session.update(worker);
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
           Worker  worker = session.get(Worker.class,  num);
        if (worker == null) return false;
            session.remove(worker);
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