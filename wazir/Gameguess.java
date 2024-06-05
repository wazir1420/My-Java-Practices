import java.util.Scanner;
public class Gameguess {
  public static void main(String[] args) {
    int randomNumber = (int) (Math.random()*100)+1;
    boolean hasWon = false;
    System.out.println("I have randomly choose a number between 1 to 100");
    System.out.println("Try to guess it");
    Scanner sc = new Scanner(System.in);
    for(int i=10; i>0; i--)
    {
        System.out.println("You have" + i + " guess(es) left. Guess Again");
        int guess = sc.nextInt();
        System.out.println("Your guess was : " + guess);
        if(randomNumber<guess)
        {
            System.out.println("Its Smaller than " + guess + " guess");
        }
        if(randomNumber>guess)
        {
           System.out.println("Its Greater than " + guess + " guess");
        }
        if(randomNumber==guess)
        {
            hasWon = true;
            break;
        }
    }
    if(hasWon==true)
    {
        System.out.println("CORRECT....... YOU WIN !!!");
    }
    else
    {
        System.out.println("GAME OVER...... YOU LOOSE");
        System.out.println("The Numer was; " + randomNumber);
    }
  }   
}