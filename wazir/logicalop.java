package wazir;
import java.util.Scanner;

public class logicalop {
    public static void main(String[] args) {
        int username;
        Scanner n=new Scanner(System.in);
        System.out.println("Enter UserId");
        username=n.nextInt();
        int password;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Password");
        password=s.nextInt();
        if(username!=12345 || password==54321)
        {
            System.out.println("Successfully login");
        }
    }
    
}
