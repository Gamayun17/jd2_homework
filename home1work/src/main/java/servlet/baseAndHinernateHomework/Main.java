package servlet.baseAndHinernateHomework;



import servlet.baseAndHinernateHomework.baseHomeworkTask7.dao.MineDaoExpenseReciever;
import servlet.baseAndHinernateHomework.baseHomeworkTask7.pojo.Expense;
import servlet.baseAndHinernateHomework.baseHomeworkTask7.pojo.Reciever;

import javax.sound.midi.Receiver;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        MineDaoExpenseReciever dao = new MineDaoExpenseReciever(ExpensesSessionFactory.getSessionFactory());

        ArrayList<Expense> getExpenses = dao.getExpenses();
        for (Expense exp : getExpenses) {
            System.out.println(exp);
        }

        ArrayList<Reciever> getRecievers = dao.getReceivers();
        for (Reciever rec : getRecievers) {
            System.out.println(rec);
        }

        Expense exp = dao.getExpense(3);
        System.out.println(exp);

        Reciever rec = dao.getReceiver(2);
        System.out.println(rec);

        Expense nExpense = new Expense();
        nExpense.setNum(7);
        nExpense.setPaydate("2023-12-28");
        nExpense.setReceiver(3);
        nExpense.setValue(113.23);
        dao.addExpenses(nExpense);

        Reciever nReciever = new Reciever();
        nReciever.setNum(4);
        nReciever.setName("CriminalMinds");
        dao.addReciever(nReciever);
    }
}

        // private static void saveReceiver(////////) {
          //   System.out.println("Enter receiver:");
           //   Scanner sc = new Scanner(System.in);
           //  System.out.println("Add receiver" + dao.addReciever(new Reciever(null,sc.next())));
