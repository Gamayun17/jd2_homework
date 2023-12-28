package servlet.baseAndHinernateHomework.baseHomeworkTask7.dao;

import servlet.baseAndHinernateHomework.baseHomeworkTask7.pojo.Expense;
import servlet.baseAndHinernateHomework.baseHomeworkTask7.pojo.Reciever;

import java.sql.SQLException;
import java.util.ArrayList;

public interface DaoExpensesReciever {
    Reciever getReceiver(int num) throws SQLException, ClassNotFoundException;
    Reciever loadReceiver(int num) throws SQLException, ClassNotFoundException;

    ArrayList<Reciever> getRecievers() throws SQLException, ClassNotFoundException;

    Expense getExpense(int num) throws SQLException, ClassNotFoundException;
    Expense loadExpense(int num) throws SQLException, ClassNotFoundException;
    ArrayList<Reciever> getReceivers() throws SQLException, ClassNotFoundException;
    ArrayList<Expense> getExpenses() throws SQLException, ClassNotFoundException;
    int addReciever(Reciever reciever) throws SQLException, ClassNotFoundException;
    int addExpenses(Expense expense) throws SQLException, ClassNotFoundException;

    void updateExpense(Expense expense) throws SQLException, ClassNotFoundException;
    void updateReciever(Reciever reciever) throws SQLException, ClassNotFoundException;

    boolean deleteExpense(Expense expense);
    boolean deleteReciever(Reciever reciever);


}
