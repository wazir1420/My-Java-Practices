package wazir;
import java.util.Scanner;
public class square {
    public static void main(String[] args) {
        int a;
        int b;
        System.out.println("Enter any number");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=a*a*a;
        System.out.println("The Square of number is: "+b);
    }
    
}
