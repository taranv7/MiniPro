package SuperPages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Twitter {

    private static final String Driver = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/mini_pro";
    private static final String USER = "root";
    private static final String PASSWORD = "velan777";

    public static void TwitterPage() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Twitter Page!");

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Content: ");
        String content = sc.nextLine();

        try {
            Class.forName(Driver);

            try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
                 PreparedStatement stmt = con.prepareStatement("INSERT INTO Twitter (username, content) VALUES (?, ?)")) {

                stmt.setString(1, username);
                stmt.setString(2, content);

                int rowsAffected = stmt.executeUpdate();

                if (rowsAffected > 0) 
                {
                    System.out.println("Data added successfully!");
                    System.out.println("What Next?!");
                    System.out.println("Enter 1 to go back!");
                    System.out.println("Enter 2 Exit!");
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
                } else {
                    System.out.println("Failed to add data!");
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
