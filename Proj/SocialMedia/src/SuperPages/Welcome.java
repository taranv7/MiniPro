package SuperPages;

import java.util.Scanner;

public class Welcome {
    public static void WelcomePage()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("What do you want to do?");
        System.out.println("Enter 1 to add a Post");
        System.out.println("Enter 2 to view Posts");

        int option=sc.nextInt();
        switch (option) {
            case 1:
                AddPost.AddPostPage();
                break;
            case 2:
                Show.ShowPages();
                break;
        
            default:
                break;
        }
    }
}
