package servlet.baseHomework.BaseHomeworkTask7;

import servlet.baseHomework.ExpensesData;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MineDaoExpenseReceiver implements DaoExpensesReceiver {


    @Override
    public Reciever getReciever(int num) throws SQLException, ClassNotFoundException {
        Statement statement;
        statement = ExpensesData.getConnection().createStatement();
        String rs= "SELECT name FROM receivers" +
                "WHERE num" + num;
        ResultSet resultSet= statement.executeQuery(rs);
        resultSet.next();
        Reciever receiver = new Reciever();
        receiver.setNum(num);
        receiver.setName(resultSet.getString("name"));
        resultSet.close();
        statement.close();
        return receiver;
    }

    @Override
    public ArrayList<Reciever> getRecievers() throws SQLException, ClassNotFoundException {
        Statement statement;
        statement = ExpensesData.getConnection().createStatement();
        String rs1= "SELECT name FROM receivers";
        ResultSet resultSet= statement.executeQuery(rs1);
        ArrayList<Reciever> receiversL= new ArrayList<>();
       while(resultSet.next()) {
           Reciever receiver = new Reciever();
           receiver.setNum(resultSet.getInt("num"));
           receiver.setName(resultSet.getString("name"));
           receiversL.add(receiver);}
        resultSet.close();
        statement.close();
        return receiversL;
    }

    @Override
    public Expense getExpense(int num) throws SQLException, ClassNotFoundException {
        String rS = "INSERT INTO expenses " + "VALUES (?)";
        PreparedStatement preparedStatement = ExpensesData.getConnection().prepareStatement(rS);
        preparedStatement.setInt(1, num);
        ResultSet resultSet = preparedStatement.executeQuery();
        Expense expense = null;
        if (resultSet.next()){
            expense = new Expense(resultSet.getInt("num"),
                    resultSet.getString("paydate"),
                    resultSet.getInt("receiver"),
                    resultSet.getDouble("value"));
        }
        preparedStatement.close();
       resultSet.close();
       return expense;
    }

    @Override
    public ArrayList<Expense> getExpenses() throws SQLException, ClassNotFoundException{
        String rS1 = "SELECT FROM receivers";
        PreparedStatement preparedStatement = ExpensesData.getConnection().prepareStatement(rS1);
        ArrayList<Expense> expensesL= new ArrayList<>();
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()){
            expensesL.add (new Expense(resultSet.getInt("num"),
                    resultSet.getString("paydate"),
                    resultSet.getInt("receiver"),
                    resultSet.getDouble("value")));
        }
        preparedStatement.close();
        resultSet.close();
        return expensesL;
    }

    @Override
    public int addReceiver(Reciever receiver) throws SQLException, ClassNotFoundException {
        Statement statement;
        statement = ExpensesData.getConnection().createStatement();
        String rs2= "INSERT INTO receivers VALUES(" + receiver.getNum() + ", " + receiver.getName() + ")";
        int aR = statement.executeUpdate(rs2);
        statement.close();
        return aR;
    }

    @Override
    public int addExpenses(Expense expense) throws SQLException, ClassNotFoundException {
        String rS2 = "INSERT INTO expenses " + "VALUES (?, ?, ?, ?)";
        PreparedStatement preparedStatement = ExpensesData.getConnection().prepareStatement(rS2);
        preparedStatement.setInt(1, expense.getNum());
        preparedStatement.setString(2, expense.getPaydate());
        preparedStatement.setInt(3, expense.getReceiver());
        preparedStatement.setDouble(4, expense.getValue());

        int Ra= preparedStatement.executeUpdate();
        return Ra;
    }
}
