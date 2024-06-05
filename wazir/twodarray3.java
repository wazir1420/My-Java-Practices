package wazir;
import java.util.Scanner;
public class twodarray3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n=sc.nextInt();
        System.out.print("Enter columns: ");
        int m=sc.nextInt();
        int matrix[][]=new int[n][m];
        System.out.println("Enter Matric Numbers: ");
        for(int t=0; t<n; t++)
        {
            for(int p=0; p<m; p++)
            {
                matrix[t][p]=sc.nextInt();
            }
        }
        System.out.println("The Transpose is: ");
        for(int p=0; p<m; p++)
        {
            for(int t=0; t<n; t++)
            {
                System.out.print(matrix[t][p]+" ");
            }
            System.out.println();
        }
    }
    
}
