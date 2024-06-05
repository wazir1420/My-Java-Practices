package wazir;
import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of Ath variable :");
         int a = sc.nextInt();
        System.out.println("Enter the value of Bth variable :");
        int b = sc.nextInt();

        int sum = a+b;
        System.out.println(sum);

        int multiply = a*b;
        System.out.println(multiply);

        int divide = a/b;
        System.out.println(divide);

        int mod = a%b;
        System.out.println(mod);

    }
    
}
