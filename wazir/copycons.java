package wazir;
class A 
{
    int a; String b;
    A()
    {
        a=10; b="wazir";
        System.out.println(a+" "+b);
    }
    A(A ref)
    {
        a=ref.a;
        b=ref.b;
        System.out.println(a+" "+b);
    }
}

class copycons {
    public static void main(String[] args) {
        A r = new A();
        A rs = new A(r);
    }
    
    
}
