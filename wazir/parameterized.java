package wazir;

class A{
    A(int a, int b, String c)
    {
        System.out.println(a+" "+b+" "+c);
    }
    
}
class parameterized{
    public static void main(String[] args) {
        A r=new A(100,200,"wazir");
    }
}
