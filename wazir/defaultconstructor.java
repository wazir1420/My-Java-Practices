package wazir;
class ted {
	int a; String b; boolean c;
	ted()
	{
		a=100; b="wazir"; c=true;
	}
	void Disp()
	{
		System.out.println(a+" "+b+" "+c);
	}
}
public class defaultconstructor{

	public static void main(String[] args) {
		ted r=new ted();
		r.Disp();
		

	}

}
