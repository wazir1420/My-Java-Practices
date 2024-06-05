package wazir;
import java.util.Scanner;
public class method4 {
    public static int checkEvenNum(int n){
        if(n%2==0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
        return n;

    }
          public static void main(String[] args) {
            System.out.println("Enter any Number: ");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            checkEvenNum(n);
          }    
}
