package wazir;
import java.util.Scanner;
public class String5 {
    public static void main(String[] args) {
        System.out.println("Enter Your Email: ");
        Scanner sc=new Scanner(System.in);
        String email= sc.next();
        String username = "";

        for(int t=0; t<email.length(); t++)
        {
            if(email.charAt(t)=='@')
            {
                break;
            }
            else
            {
                username += email.charAt(t);
            }
        }
        System.out.println("Your Username is: "+ username);
    }
    
}
