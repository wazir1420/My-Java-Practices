package wazir;
import java.util.Scanner;
public class hamza {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Who is your jaan?: ");
        String d=sc.nextLine();

        if(d.equals("Rubab"))
        {
            for(int i=0; i<=100; i++)
            {
                System.out.println("100% Correct Answer");
            }
        }
        else
        {
            System.out.println("Sorry you Enter Wrong name");
        }
    }
    
}
