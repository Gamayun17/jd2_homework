package servlet.baseHomework.BaseHomeworkTask7;

import java.sql.SQLException;

public class TestExpensesReceiver {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        MineDaoExpenseReceiver daoMine= new MineDaoExpenseReceiver();
        System.out.println(daoMine.getReciever(2));
        System.out.println(daoMine.getExpense(4));
        System.out.println(daoMine.getExpenses());
        System.out.println(daoMine.getRecievers());

        Reciever r = new Reciever();
        r.setNum(4);
        r.setName("АльфаБанк");
        daoMine.addReceiver(r);
        Expense e  = new Expense( 11, "27.12.2026", 3, 1826.26);
        daoMine.addExpenses(e);

    }
}
