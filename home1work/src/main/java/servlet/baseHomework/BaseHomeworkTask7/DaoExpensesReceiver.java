package servlet.baseHomework.BaseHomeworkTask7;

import java.util.ArrayList;

public interface DaoExpensesReceiver {
    Reciever getReciever(int num);
    ArrayList<Reciever> getRecivers();
    Expense getExpense(int num);
    ArrayList<Expense> getExpenses();

    int addReceiver(Reciever receiver);
    int addExpenses(Expense expense);
}
