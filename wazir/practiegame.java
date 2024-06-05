import java.util.Scanner;
public class practiegame {
    public static void main(String[] args) {
        int guessGame = 44;
        System.out.println("I hava randomly choose a number between 1 to 100");
        System.out.println("Try to guess it");
        Scanner sc=new Scanner(System.in);
        for(int i=10; i>0; i--)
        {
            System.out.println("You hava " +i+ " gues(es) left");
            int guess=sc.nextInt();
            System.out.println("You guess was " + guess);
            if(guessGame<guess)
            {
                System.out.println("Its Smaller than " + guess);
            }
            if(guessGame>guess)
            {
                System.out.println("Its greater than " + guess);
            }
            if(guessGame==guess)
            {
                break;
            }
        }
        if(guessGame==44)
        {
            System.out.println("CORRECT......YOU WIN");
        }
        else
        {
            System.out.println("GAME OVER.......YOU LOOSE");
            System.out.println("The number was: " + guessGame);
        }
    }

    
}
