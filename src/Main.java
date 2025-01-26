import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] moves = {"Rock", "Paper", "Scissors"};//all moves we can choose
        Random random = new Random();
        boolean again = true;//game continue or not
        Scanner sc = new Scanner(System.in);

        while (again){
            System.out.println("Select a Character(Rock, Paper, Scissors)");
            String userMove = sc.nextLine();//user input

            //if user input is incorrect, give a try again message
            if(userMove.isEmpty() || !(userMove.equals("Rock")) && !(userMove.equals("Paper")) && !(userMove.equals("Scissors"))){
                System.out.println("You Wrote Wrong Number!Try Again!\n\n");
                continue;
            }

            //bot move
            int botMoveNumber = random.nextInt(3);
            String botMove = moves[botMoveNumber];

            //gameRules
            switch (userMove){
                //if you select Rock
                case "Rock":
                    switch (botMove){
                        case "Rock":
                            System.out.println("Bot Move:Rock");
                            System.out.println("Draw!");break;
                        case "Paper":
                            System.out.println("Bot Move:Paper");
                            System.out.println("You Lost");break;
                        case "Scissors":
                            System.out.println("Bot Move:Scissors");
                            System.out.println("You Won");break;
                    }break;

                //if you select Paper
                case "Paper":
                    switch (botMove){
                        case "Rock":
                            System.out.println("Bot Move:Rock");
                            System.out.println("You Won");break;
                        case "Paper":
                            System.out.println("Bot Move:Paper");
                            System.out.println("Draw!");break;
                        case "Scissors":
                            System.out.println("Bot Move:Scissors");
                            System.out.println("You Lost");break;
                    }
                    break;

                //if you select Scissors
                case "Scissors":
                    switch (botMove){
                        case "Rock":
                            System.out.println("Bot Move:Rock");
                            System.out.println("You Lost");break;
                        case "Paper":
                            System.out.println("Bot Move:Paper");
                            System.out.println("You Won");break;
                        case "Scissors":
                            System.out.println("Bot Move:Scissors");
                            System.out.println("Draw!");break;
                    }break;
            }

            System.out.println();//break a line for tidiness

            //deciding replay
            System.out.println("You Wanna Play Again?(Y,N)\n");

            sc = new Scanner(System.in);
            String decisionOfReplay = sc.nextLine();

            if(!Objects.equals(decisionOfReplay, "y") && !Objects.equals(decisionOfReplay, "Y")){
                again = false;
                System.out.println("You Left Game!Bye!");
            }

        }
    }
}