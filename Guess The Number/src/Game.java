import java.util.*;
public class Game {
    private final int random;
    private int input;
    private int counter=0;

    public Game(){
        // random no generator from 0 to 100
        this.random = (int)(Math.random() * 100);
    }

    public void inputno(int n){
        input = n;
    }

    public int isCorrect(int input){
        if(input == random){
            System.out.println("Yoo-hoo! You Guessed it right.");
            return 1;
        }
        if(input<random){
            System.out.println("Please guess a higher no.");
        }
        if(input>random){
            System.out.println("Please guess a smaller no.");
        }

        return 0;
    }



    public static void main(String[] args) {

        Game ob = new Game();
        System.out.println("Let's a game of guessing the numbers;");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no of guesses: ");
        ob.counter = in.nextInt();

        // this prints the random generated no.
       // System.out.println(ob.random);



        while (ob.counter!=0){

            System.out.print("Enter the no:");
            int n = in.nextInt();

            ob.inputno(n);

            int x = ob.isCorrect(ob.input);
            if(x==1){
                break;
            }
            ob.counter--;
        }




    }
}
