//package SuperPages;
//
//import java.util.Scanner;
//
//public class Adding {
//    
//    private static final String Driver = "com.mysql.cj.jdbc.Driver";
//    private static final String URL = "jdbc:mysql://localhost:3306/mini_pro";
//    private static final String USER = "root";
//    private static final String PASSWORD = "velan777";
//
//    public static void AddingPage()
//    {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Please enter your choice to add Post!");
//        System.out.println("Enter 1 to add your post in Instagram");
//        System.out.println("Enter 2 to add your post in Twitter");
//        System.out.println("Enter 3 to add post in Both the platforms");
//
//        int option =sc.nextInt();
//
//        switch (option) {
//            case 1:
//                Insta.InstaPage();
//                break;
//            case 2:
//                Twitter.TwitterPage();
//                break;
//            case 3:
//                // Twitter.TwitterPage();
//                Both.BothPage();
//                break;
//        
//            default:
//                break;
//        }
//
//    }
//    
//}

package SuperPages;

import java.util.Scanner;

public class Adding {
    // Private fields
    private static final String Driver = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/mini_pro";
    private static final String USER = "root";
    private static final String PASSWORD = "velan777";

    public static void AddingPage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your choice to add Post!");
        System.out.println("Enter 1 to add your post in Instagram");
        System.out.println("Enter 2 to add your post in Twitter");
        System.out.println("Enter 3 to add post in Both the platforms");

        int option = sc.nextInt();

        switch (option) {
            case 1:
                Insta insta = new Insta();
                insta.InstaPage();
                break;
            case 2:
                Twitter twitter = new Twitter();
                twitter.TwitterPage();
                break;
            case 3:
                // Twitter twitter = new Twitter();
                // twitter.TwitterPage();
                Both both = new Both();
                both.BothPage();
                break;

            default:
                break;
        }

        sc.close();
    }
}

