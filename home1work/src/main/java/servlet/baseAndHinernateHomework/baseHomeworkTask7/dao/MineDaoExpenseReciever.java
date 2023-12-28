package servlet.baseAndHinernateHomework.baseHomeworkTask7.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import servlet.baseAndHinernateHomework.baseHomeworkTask7.pojo.Expense;
import servlet.baseAndHinernateHomework.baseHomeworkTask7.pojo.Reciever;

import java.sql.SQLException;
import java.util.ArrayList;

public class MineDaoExpenseReciever implements DaoExpensesReciever {
    private final SessionFactory sessionFactory;

    public MineDaoExpenseReciever(SessionFactory sessionFactory) {
        if (sessionFactory == null) {
            throw new IllegalStateException("sessionFactory cannot be null");
        }
        this.sessionFactory = sessionFactory;
    }



    @Override
    public Reciever getReceiver(int num) throws SQLException, ClassNotFoundException {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Reciever.class, num);
        }
    }

    @Override
    public ArrayList<Reciever> getRecievers() throws SQLException, ClassNotFoundException {
        try (Session session = sessionFactory.openSession()) {
            Query<Reciever> query = session.createQuery("fromReciever", Reciever.class);
            return new ArrayList<Reciever>(query.list());
        }
    }


    @Override
    public Expense getExpense(int num) throws SQLException, ClassNotFoundException {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Expense.class, num);
        }
    }


    @Override
    public ArrayList<Expense> getExpenses() throws SQLException, ClassNotFoundException {
        try (Session session = sessionFactory.openSession()) {
            Query<Expense> query = session.createQuery("FROM Expenses", Expense.class);
            return new ArrayList<Expense>(query.list());
        }
    }

    @Override
    public int addReciever(Reciever reciever) throws SQLException, ClassNotFoundException {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            int num = (int) session.save(reciever);
            transaction.commit();
            return num;
        }
    }

    @Override
    public int addExpenses(Expense expense) throws SQLException, ClassNotFoundException {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            int num = (int) session.save(expense);
            transaction.commit();
            return num;
        }
    }




    @Override
    public Reciever loadReceiver(int num) throws SQLException, ClassNotFoundException {
        try (Session session = sessionFactory.openSession()) {
            return session.load(Reciever.class, num);
        }
    }

    @Override
    public Expense loadExpense(int num) throws SQLException, ClassNotFoundException {
        try (Session session = sessionFactory.openSession()) {
            return session.load(Expense.class, num);
        }
    }

    @Override
    public ArrayList<Reciever> getReceivers() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public void updateExpense(Expense expense) throws SQLException, ClassNotFoundException {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.update(expense);
            transaction.commit();
        }
    }


    @Override
    public void updateReciever(Reciever reciever) throws SQLException, ClassNotFoundException {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.update(reciever);
            transaction.commit();
        }
    }

    @Override
    public boolean deleteExpense(Expense expense) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.delete(expense);
            transaction.commit();
            return true;
        }
    }

    @Override
    public boolean deleteReciever(Reciever reciever) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.delete(reciever);
            transaction.commit();
            return true;
        }
    }
}
