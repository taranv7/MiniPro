package SuperPages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public abstract class Page {
    protected static final String Driver = "com.mysql.cj.jdbc.Driver";
    protected static final String URL = "jdbc:mysql://localhost:3306/mini_pro";
    protected static final String USER = "root";
    protected static final String PASSWORD = "velan777";

    protected static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName(Driver);
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
