package wazir;

import java.util.Scanner;

public class yaho {
    public static void main(String[] args) {
        
        int a,b,c,d,e,f,g;
        System.out.println("Enter the value of Two numbers: ");

        Scanner wazir1=new Scanner(System.in);

        a = wazir1.nextInt(); 
        b = wazir1.nextInt();

        c = a+b;
        System.out.println("Sum of Two numbers: "+c);
        d = a-b;
        System.out.println("Subtruct of Two numbers: "+d);
        e = a*b;
        System.out.println("Multiply of Two numbers: "+e);
        f = a/b;
        System.out.println("Divide of Two numbers: "+f);
        g = a%b;
        System.out.println("Mod of Two numbers: "+g);

        

    }
    
}
