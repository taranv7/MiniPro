package SuperPages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InstaShow {

    private static final String Driver = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/mini_pro";
    private static final String USER = "root";
    private static final String PASSWORD = "velan777";
    
    public static void InstaShowPage() {
        Scanner sc=new Scanner(System.in);
        try {
            Class.forName(Driver);

            try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
                 Statement stmt = con.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT * FROM Insta")) {

                System.out.println("All Insta Posts:");
                while (rs.next()) {
                    String username = rs.getString("username");
                    String content = rs.getString("content");

                    System.out.println("Username: " + username);
                    System.out.println("Content: " + content);
                    System.out.println("---------------------------");

                    int a=sc.nextInt();
                    switch (a) {
                        case 1:
                            Welcome.WelcomePage();
                            break;
                        case 2:
                            // Welcome.WelcomePage();
                            System.out.println("Thank you for visiting our Application");
                            break;
                    
                        default:

                            break;
                    }

                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        InstaShowPage();
    }
}
