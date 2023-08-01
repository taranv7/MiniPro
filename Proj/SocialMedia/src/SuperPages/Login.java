package SuperPages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {
    static String Driver = "com.mysql.cj.jdbc.Driver";
    static String URL = "jdbc:mysql://localhost:3306/mini_pro";
    static String USER = "root";
    static String PASSWORD = "velan777";

    public static boolean authenticate(String username, String password) throws ClassNotFoundException, SQLException {
        Class.forName(Driver);

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = con.prepareStatement("SELECT * FROM Login WHERE username = ?")) {

            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String db_Password = rs.getString("password");
                return db_Password.equals(password);
            } else {
                throw new SQLException("User not found!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw e; 
        }
    }

    public static void loginPage() throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Loadig.....");
        System.out.println("Login Page!");

        System.out.print("User Name: ");
        String username = sc.nextLine();

        System.out.print("Password: ");
        String password = sc.nextLine();

        try {
            if (authenticate(username, password)) {
                System.out.println("Login Successful");
                // Home.HomePage();
                // Home.displayAllPosts();
                Welcome.WelcomePage();
            } else {
                System.out.println("Invalid Credentials");
                System.out.println("Options:");
                System.out.println("1. Retry Login");
                System.out.println("2. Signup");
                System.out.print("Enter your option (1/2):");

                int option = sc.nextInt();
                sc.nextLine();

                switch (option) {
                    case 1:
                        loginPage();
                        break;
                    case 2:
                        System.out.println("Signup");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        } catch (SQLException e) {
            System.out.println("An error occurred during login: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
