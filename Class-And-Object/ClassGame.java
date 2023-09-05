import java.util.Scanner;

class Game {
    private int counter = 0;
    private int myNumber;
    private int compNumber;

    public Game() {
        compNumber = (int) (Math.random() * 100);
    }

    public void setNumber(int n) {
        myNumber = n;
    }

    public int isCorrect() {
        if (myNumber == compNumber) {
            return 0;
        } else if (myNumber > compNumber) {
            return -1;
        } else {
            return 1;
        }
    }

    public void setCounter() {
        counter++;
    }

    public void getCounter() {
        System.out.println("The number of guesses were" + counter);
    }
}

public class ClassGame {
    public static void main(String[] args) {
        Game g = new Game();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number between 1 to 100(1-100)");
            int n = sc.nextInt();
            g.setNumber(n);

            if (g.isCorrect() == 0) {
                g.setCounter();
                System.out.println("Congratulation!! You have guessed the correct number");
                g.getCounter();
                break;
            } else if (g.isCorrect() == -1) {
                g.setCounter();
                System.out.println("Enter a smaller number!!");
                g.getCounter();
                break;
            } else if (g.isCorrect() == 1) {
                g.setCounter();
                System.out.println("Enter a larger number!!");
                // g.getCounter();
                // break;

            }
        }
    }

}
