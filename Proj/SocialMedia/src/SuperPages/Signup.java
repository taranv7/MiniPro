package SuperPages;

    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.PreparedStatement;
    import java.sql.SQLException;
    import java.util.Scanner;

    public class Signup {

        private static final String Driver = "com.mysql.cj.jdbc.Driver";
        private static final String URL = "jdbc:mysql://localhost:3306/mini_pro";
        private static final String USER = "root";
        private static final String PASSWORD = "velan777";

        public static void insertUserData(String username, String password) throws ClassNotFoundException {
            Class.forName(Driver);

            try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement stmt = con.prepareStatement("INSERT INTO Login (username, password) VALUES (?, ?)")) {

                stmt.setString(1, username);
                stmt.setString(2, password);

                int rowsAffected = stmt.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("\n\033[1;32m*********************************************");
                    System.out.println("*     Social Media Management System          *");
                    System.out.println("*            Sign Up Successful!            *");
                    System.out.println("*********************************************\033[0m");
                    Login.loginPage(); 
                } else {
                    System.out.println("\n\033[1;31m*********************************************");
                    System.out.println("*  Social Media Management System              *");
                    System.out.println("*    Failed to Sign Up. Please try again.   *");
                    System.out.println("*********************************************\033[0m");

                    System.out.println();
                    System.out.println();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public static void SignUpPage() throws ClassNotFoundException {
            Scanner sc = new Scanner(System.in);

            System.out.println("\n\033[1;35m*********************************************");
            System.out.println("*          Social Media Management System             *");
            System.out.println("*            Welcome to Sign Up!            *");
            System.out.println("*********************************************\033[0m");

            System.out.print("\033[1mEnter the User Name: \033[0m");
            String username = sc.nextLine();

            System.out.print("\033[1mEnter the Password: \033[0m");
            String password = sc.nextLine();

            insertUserData(username, password);
        }
    }