package wazir;

import java.net.Socket;

public class StringBuild {
    public static void main(String[] args) {
        StringBuilder p=new StringBuilder("Pakiza");
        System.out.println(p);

        //charat at index 0
        System.out.println(p.charAt(0));

        //lenght
        System.out.println(p.length());

        // set char at index 0
        // p.setCharAt(0, 't');
        // System.out.println(p);

        //insert
        // p.insert(0,'s');
        // System.out.println(p);

        // delete
        // p.delete(2, 3);
        // System.out.println(p);
        
        //add another string
        p.append(" batool");
        System.out.println(p);

    }
    
}
