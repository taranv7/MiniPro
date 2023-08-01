package SuperPages;

import java.util.Scanner;

public class Show {
    public static void ShowPages()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 to show posts from Insta");
        System.out.println("Enter 2 to show posts from Twitter");
        System.out.println("Enter 3 to show posts from Both the Platforms");


        int ch=sc.nextInt();
        switch (ch) {
            case 1:
                // Insta.InstaPage();
                InstaShow.InstaShowPage();
                break;
            case 2:
                TwitterShow.TwitterShowPage();
                break;
            case 3:
                Home.HomePage();
                break;
        
            default:
                System.out.println("Invalid input!!");
                ShowPages();
                break;
        }
    }
    
}
