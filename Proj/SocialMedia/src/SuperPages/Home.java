package SuperPages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Home {

    static String Driver = "com.mysql.cj.jdbc.Driver";
    static String URL = "jdbc:mysql://localhost:3306/mini_pro";
    static String USER = "root";
    static String PASSWORD = "velan777";

    private static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(Driver);
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    private static void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void displayAllPosts() {
        System.out.println("Media Space");
    }

    public static void HomePage() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM Post");

            System.out.println("All Posts:");
            while (resultSet.next()) {
                String username = resultSet.getString("username");
                String content = resultSet.getString("content");

                System.out.println("Username: " + username);
                System.out.println("Content: " + content);
                System.out.println("---------------------------");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Exception Message: " + e.getMessage());
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                closeConnection(connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        HomePage();
        Both.BothPage();

        try {
            displayAllPosts();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
