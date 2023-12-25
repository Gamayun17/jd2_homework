package servlet.baseHomework;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {


        int num = Integer.parseInt(args[0]);
        String paydate = args[1];
        int receiver = Integer.parseInt(args[2]);
        double value = Double.parseDouble(args[3]);

        addAndprint(num, paydate, receiver, value);
    }

    public static void addAndprint(int num, String paydate, int receiver, double value) throws SQLException, ClassNotFoundException {

            Statement statement = ExpensesData.getConnection().createStatement();
            String insertInto= "INSERT INTO expenses " +
                    "VALUES (" + num + ", '" + paydate + "', " + receiver + ", " + value + ")";
            statement.executeUpdate(insertInto);


            String selectInfo= "SELECT paydate, value, name " +
                    "FROM expenses, receivers " +
                    "WHERE receiver=receivers.num";
            ResultSet resultSet = statement.executeQuery(selectInfo);


            while (resultSet.next()) {

                String date = resultSet.getString("paydate");
                double value1 =  resultSet.getDouble("value");
                String name = resultSet.getString("name");

                System.out.println(date + + value1 +name );
            }

            resultSet.close();
            statement.close();

    }
}