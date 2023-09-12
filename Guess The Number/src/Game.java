import java.util.*;
public class Game {
    private final int random;
    private int input;
    private int counter=0;

    private static int count1 = 0;
    private static int count2 = 0;

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
            count2++;

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

        System.out.println("Let's play a game of guessing the numbers;");
        Scanner in = new Scanner(System.in);


        //   First we create two integers to count the number of plays to find the final score.

        // another integer to ask whether the user wants to play again or not.
        int playagain;
        // this is the main loop which runs until the user wants to play again.
        do {
            Game ob = new Game();
            count1++;

            System.out.print("Enter the no of guesses: ");
            ob.counter = in.nextInt();

            // this prints the random generated no.
            // System.out.println(ob.random);


            while (ob.counter != 0) {

                System.out.print("Enter the no:");
                int n = in.nextInt();

                ob.inputno(n);

                int x = ob.isCorrect(ob.input);
                if (x == 1) {
                    break;
                }
                ob.counter--;
            }

            System.out.println("Want to play again?");
            System.out.println("Press 1 for Yes and 0 for No");
            playagain = in.nextInt();
        }while(playagain==1);

        System.out.println("Your Final Score is: " + count1 + " out of " + count2 + " games played.");
        System.out.println("Thank You for playing the game. Have a nice day :)");
        System.out.println("Bye Bye!!");
        System.out.println("Created by: Naveen Kumar");
        System.out.println("Github: https://github.com/itsnaveenk/CODSOFT.git");
        System.out.println("LinkedIn: https://www.linkedin.com/in/itsnaveenk/");
        System.out.println("Twitter: https://twitter.com/itsnaveenk");

        in.close();

    }
}
