import java.util.Stack;  
public class pushes  
{  
public static void main(String[] args)   
{  
//creating an instance of Stack class  
Stack<Integer> stk= new Stack<>();  
// checking stack is empty or not  
boolean result = stk.empty();  
System.out.println("Is the stack empty? " + result);  
// pushing elements into stack  
stk.push(78);  
stk.push(113);  
stk.push(90);  
stk.push(120);  
//prints elements of the stack  
System.out.println("Elements in Stack: " + stk);  
result = stk.empty();  
System.out.println("Is the stack empty? " + result); 

System.out.println("is the stack is full");
stk.pop();
stk.pop();

System.out.println("element are: "+ stk);
stk.pop();
System.out.println("element are: "+ stk);
}  
}   
    

