package wazir;
import java.util.Scanner;
public class StringBuild2 {
    public static void main(String[] args) {
        System.out.println("Enter Your String: ");
        StringBuilder s=new StringBuilder("");
        Scanner sc=new Scanner(System.in);
        s.append(sc.nextLine());

        for(int i=0; i<s.length()/2; i++)
        {
            int front = i;
            int back = s.length()-1-i;
            
            char frontChar = s.charAt(front);
            char backChar = s.charAt(back);

            s.setCharAt(front, backChar);
            s.setCharAt(back, frontChar);
        }
        System.out.println(s);

    }
    
}
