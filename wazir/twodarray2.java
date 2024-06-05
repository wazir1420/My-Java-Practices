package wazir;
import java.util.Scanner;
public class twodarray2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows: ");
        int n=sc.nextInt();
        System.out.println("Enter columns: ");
        int m=sc.nextInt();
        int matrix[][]=new int[n][m];
        System.out.println("Enter Matrixs Numbers: ");
        for(int t=0; t<n; t++)
        {
            for(int p=0; p<m; p++)
            {
                matrix[t][p]=sc.nextInt();
            }
        }
        System.out.println("The Spiral Order Matrix is: ");
        int rowStart=0;
        int rowEnd=n-1;
        int colStart=0;
        int colEnd=m-1;

        while(rowStart<=rowEnd && colStart<=colEnd)
        {
            for(int col=colStart; col<=colEnd; col++)
            {
                System.out.print(matrix[rowStart][col]+ " ");
            }
            rowStart++;
           for(int row=rowStart; row<=rowEnd; row++)
           {
                System.out.print(matrix[row][colEnd]+ " ");
           }
           colEnd--;
           for(int col=colEnd; col>=colStart; col--)
           { 
            System.out.print(matrix[rowEnd][col]+ " ");
           }
           rowEnd--;
           for(int row=rowEnd; row>=rowStart; row--)
           {
                System.out.print(matrix[row][colStart]+ " ");
           }
           colStart++;




        }
        
    }
    
}
