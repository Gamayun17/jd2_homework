package servlet.springHomework.Fifteen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {
    private static DataSource dataSource;

    protected DataSource() throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
    }

    protected Connection getExpensesData() throws SQLException {
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/home1work",
                "user",
                "user");

    }

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        if (dataSource == null) {
            dataSource = new DataSource();
        }
        return dataSource.getExpensesData();
    }

}
