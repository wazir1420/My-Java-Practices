package wazir;
import java.util.Scanner;
public class method5 {
    public static int findTable(int n){
        for(int i = 1; i<=10; i++)
        {
            System.out.print(n*i+" ");
        }
        return n;
    }
    public static void main(String[] args) {
        System.out.println("Enter any Number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        findTable(n);
    }
    
    
}
