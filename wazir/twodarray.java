package wazir;
import java.util.Scanner;
public class twodarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        int matrix[][]=new int[rows][columns];

        for(int t=0; t<rows; t++)
        {
            for(int p=0; p<columns; p++)
            {
                matrix[t][p]=sc.nextInt();
            }
        }
        for(int t=0; t<rows; t++)
        {
            for(int p=0; p<columns; p++)
            {
                System.out.print(matrix[t][p]+" ");
            }
            System.out.println();
        }
        
    }
    
}
