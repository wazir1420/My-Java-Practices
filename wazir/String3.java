package wazir;
import java.util.Scanner;
public class String3 {
    public static void main(String[] args) {
        System.out.println("Enter Size: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String array []= new String[size];
        int totallenght=0;
        System.out.println("Enter Names: ");
        for(int i=0; i<size; i++)
        {
            array[i]=sc.next();
            totallenght += array[i].length();
        }
          System.out.println("The Total lenght is: "+totallenght);
    }
    
}
