package SuperPages;

import java.util.Scanner;

public class AddPost {

    static String Driver = "com.mysql.cj.jdbc.Driver";
    static String URL = "jdbc:mysql://localhost:3306/mini_pro";
    static String USER = "root";
    static String PASSWORD = "velan777";

    public static void AddPostPage()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Wanna Add a Post?");
        System.out.println("Enter 'y' to Proceed");
        String yes=sc.nextLine();
        if(yes.equals("y"))
        {
            System.out.println("ALERT!You have entered 'y'");
            Adding.AddingPage();
        }

        else{
            System.out.println("Invalid Input!!!");
            AddPostPage();
        }
    }

    
}
