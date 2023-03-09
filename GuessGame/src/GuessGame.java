import java.util.Random;
import java.util.Scanner;

public class GuessGame {


    int randomNumber;
    int counter=0;

    int max=100;
    static Scanner scn = new Scanner(System.in);
    Random rnd = new Random();


    public int getCounter(){
        return this.counter;
    }
    public int getRandomNumber() {

        this.randomNumber= Math.abs(rnd.nextInt()) % (max + 1);
        return randomNumber;
    }

    public GuessGame() {

        randomNumber = getRandomNumber();
    }

    public void play() {
        //guess= scn.nextInt();

        while (true) {
            int guess = scn.nextInt();
            // başlangıç

            if
            (guess < randomNumber) {
                System.out.println("Your number is small, please pick a bigger one");
                counter=getCounter()+1;
            } else if
            (guess > randomNumber) {
                System.out.println("Your number is big; please pick a smaller one");
                counter=getCounter()+1;

            } else {
                System.out.println("Congratulations!");
                System.out.println("You've found the answer at your "+ (getCounter()+1) + ". guess...");


                break;
            }
        }


    }

    public static void main(String[] args) {

        System.out.println("Welcome to my game, please pick a number between 0 and 100 (100 included)");
        System.out.println("You have unlimited choice right");
        GuessGame gg = new GuessGame();
        String  pref;

        do {

            long startTime = System.currentTimeMillis();

            gg.play();

            long endTime = System.currentTimeMillis();
            // bitiş
            long estimatedTime = endTime - startTime; // Geçen süre milisaniye cinsinden elde edilir
            double seconds = (double)estimatedTime/1000; // saniyeye çevirmek için 1000'e bölüyoruz.
            System.out.println("You've found the answer in "+ seconds+ " seconds... ");

            System.out.println("Do You Want to Play Again? Y/N");


            pref = scn.next();

            if(pref.equalsIgnoreCase("Y")) {
                System.out.println("Welcome to my game, please pick a number between 0 and 100 (100 included)");

            }

        }while(pref.equalsIgnoreCase("Y"));
    }
}