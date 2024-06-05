package wazir;
import java.util.Scanner;
public class wazirstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Username: ");
        String username=sc.next();
        System.out.print("Enter Your Password: ");
        String password=sc.next();

        if(username=="wazir" && password=="tatheer")
        {
          System.out.println("Successfully Login");
        }
        
    }
    
}
