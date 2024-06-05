package wazir;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        System.out.println("Enter Size: ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int number[]=new int[size];

        for(int i=0; i<size; i++)
        {
            number[i]=sc.nextInt();
        }
        System.out.println("Enter value of X: ");
        int x=sc.nextInt();
        for(int i=0; i<number.length; i++)
        {
            if(number[i]==x)
            {
                System.out.println("X found at index: "+i);
            }
        }

    }


    }
    

