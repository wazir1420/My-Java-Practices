package wazir;
import java.util.Scanner;
public class method1 {
    public static int calculateProduct(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        try (Scanner sc = new Scanner(System.in)) {
            int a=sc.nextInt();
            int b=sc.nextInt();

            System.out.println("Product of 2 number is: "+ calculateProduct(a, b));
        }
    }
    
}
