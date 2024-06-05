package wazir;

public class privatecons {
    int a; double b; String c;
    private privatecons()
    {
        a=10; b=33.09; c="wazir";
        System.out.println(a+" "+b+" "+c);
    }
    public static void main(String[] args) {
        privatecons r=new privatecons();
    }
    
}
