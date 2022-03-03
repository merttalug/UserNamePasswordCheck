package Statements;
import java.util.Scanner;
public class UserPasswordCheck {
    public static void main(String[] args) {
        String userName,password;
        Scanner input=new Scanner(System.in);

        System.out.println("Please enter your Username: ");
        userName=input.nextLine();

        System.out.println("Please enter your Password:");
        password=input.nextLine();


        if (userName.equals("Patika") && password.equals("java123")){
            System.out.println("Your entrance is successful, Welcome !!");

        }
        else {
            System.out.println("The username or password is incorrect, please try again !");
        }

    }
}
