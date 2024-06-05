package wazir;
import java.util.Scanner;
public class array3 {
    public static void main(String[] args) {
        System.out.println("Enter Size: ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int number[]=new int[size];
        System.out.println("Enter numbers: ");
        for(int i=0; i<size; i++)
        {
            number[i]=sc.nextInt();
        }

        boolean isAscending = true;
        for(int i=0; i<number.length-1; i++)
        {
            if(number[i] > number[i+1])
            {
                isAscending = false;
            }
        }
        if(isAscending)
        {
            System.out.println("The array is sorted in Ascending order");
        }
        else
        {
            System.out.println("The array is sorted in descending order");
        }

    }
    
}
