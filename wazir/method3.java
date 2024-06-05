package wazir;
import java.util.Scanner;
public class method3 {
    public static void printFactorial(int n){
        if(n<0){
            System.out.println("Invalid number");
            return;
        }
        int factorial=1;
        for(int i=n; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        System.out.println("Enter any numbers: ");
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            System.out.print("Factorial is: ");
            printFactorial(n);
        }
    }
    
}
