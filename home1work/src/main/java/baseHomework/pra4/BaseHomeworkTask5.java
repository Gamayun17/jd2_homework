package baseHomework.pra4;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseHomeworkTask5 {

    public static void main(String[] args) {


        int num = Integer.parseInt(args[0]);
        String paydate = args[1];
        int receiver = Integer.parseInt(args[2]);
        double value = Double.parseDouble(args[3]);

        addAndprint(num, paydate, receiver, value);
    }

    public static void addAndprint(int num, String paydate, int receiver, double value)  {

        String insertInto = "INSERT INTO expenses " + "VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = ExpensesData.getConnection().prepareStatement(insertInto);

            preparedStatement.setInt(1, num);
            preparedStatement.setString(2, paydate);
            preparedStatement.setInt(3, receiver);
            preparedStatement.setDouble(4, value);
            preparedStatement.executeUpdate();


            String selectInfo = "SELECT paydate, value, name " +
                    "FROM expenses, receivers " +
                    "WHERE receiver=receivers.num";
            ResultSet resultSet = preparedStatement.executeQuery(selectInfo);


            while (resultSet.next()) {

                String date = resultSet.getString("paydate");
                double value1 = resultSet.getDouble("value");
                String name = resultSet.getString("name");

                System.out.println(date + +value1 + name);
            }

            resultSet.close();
            preparedStatement.close();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
