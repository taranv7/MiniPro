package SuperPages;

import java.sql.SQLException;
import java.util.Scanner;

public class IndexPage {
    public static void main(String args[]) throws ClassNotFoundException, SQLException
    {
       System.out.println("Welcome Taran!!!");
        System.out.println("Enter 1 to login");
		System.out.println("Enter 2 to Sign up");

		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		
		if(choice==1)
		{
			Login.loginPage();
		}
		else if(choice==2)
		{
			Signup.SignUpPage();
		}
		else
		{
			System.out.print("Invalid Input.... Please Try Again😭😒");
			Index.main(args);
		}
    }

}
