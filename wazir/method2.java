package wazir;
import java.util.Scanner;
public class method2 {
    public static int checkPrimeNum(int n){
       int b=0;
       for(int i = 2; i<=n-1; i++){
        if(n%i==0){
            b=b+1;
        }
       }
       if(b==0){
        System.out.println("Number is Prime");
       }
       else{
        System.out.println("Number is not Prime");
       }
        return n;

    }
    public static void main(String[] args) {
      
        System.out.println("Enter any number: ");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        checkPrimeNum(n);
    }
    
}
