package wazir;
import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        System.out.println("Enter Size: ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        String name[]= new String[size];
        System.out.println("Enter names: ");
        for(int i=0; i<size; i++)
        {
            name[i]=sc.next();
        }
        for(int i=0; i<name.length; i++)
        {
            System.out.println("name "+ (i+1)+  " is "+name[i]);
        }
    }    
    
}
