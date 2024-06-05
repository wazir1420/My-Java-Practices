package wazir;
import java.util.Scanner;
public class paki {
    public static void main(String[] args) {
        System.out.print("Who is your jaan?: ");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();

        if(name.equals("Pakiza"))
        {
           for(int a=0; a<=10; a++)
           {
            System.out.println("!00% Correct Answer");
           }
        }
        else
        {
          System.out.println("Nope It's Wrong");
        }
    }
    
}
