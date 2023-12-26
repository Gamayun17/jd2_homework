package servlet.baseHomework.BaseHomeworkTask7;

import java.sql.SQLException;
import java.util.ArrayList;

public interface DaoExpensesReceiver {
    Reciever getReciever(int num) throws SQLException, ClassNotFoundException;
    ArrayList<Reciever> getRecievers() throws SQLException, ClassNotFoundException;
    Expense getExpense(int num) throws SQLException, ClassNotFoundException;
    ArrayList<Expense> getExpenses() throws SQLException, ClassNotFoundException;

    int addReceiver(Reciever receiver) throws SQLException, ClassNotFoundException;
    int addExpenses(Expense expense) throws SQLException, ClassNotFoundException;
}
