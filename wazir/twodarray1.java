package wazir;
import java.util.Scanner;
public class twodarray1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of Rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter Size of Columns: ");
        int cols=sc.nextInt();
        int matrix[][]=new int[rows][cols];

        System.out.println("Enter Matrix numbers: ");
        for(int t=0; t<rows; t++)
        {
            for(int p=0; p<cols; p++)
            {
                matrix[t][p]=sc.nextInt();
            }
        }
        System.out.println("Enter the Value of X: ");
        int x=sc.nextInt();

        for(int t=0; t<rows; t++)
        {
            for(int p=0; p<cols; p++)
            {
                if(matrix[t][p]==x)
                {
                    System.out.println("X found at index: ("+ t +", "+ p +")");
                }
            }
        }
    }
    
}
