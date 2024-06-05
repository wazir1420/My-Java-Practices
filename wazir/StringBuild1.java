package wazir;

public class StringBuild1 {
    public static void main(String[] args) {
        StringBuilder t=new StringBuilder("Pakiza");

        for(int i=0; i<t.length()/2; i++)
        {
            int front =i;
            int back =t.length()-1-i;

            char frontChar=t.charAt(front);
            char backChar=t.charAt(back);

            t.setCharAt(front, backChar);
            t.setCharAt(back, frontChar);
        }
        System.out.println(t);
    }
    
    
}
