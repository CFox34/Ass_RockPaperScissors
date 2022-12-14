import java.util.*;


class Game {

    public static final String ROCK = "ROCK";

    public static final String PAPER = "PAPER";

    public static final String SCISSORS = "SCISSORS";

    public static void main(String[] args)
    {

        System.out.println("Enter any one of the following inputs: ");
        System.out.println("ROCK");
        System.out.println("PAPER");
        System.out.println("SCISSORS");
        System.out.println();

        String playerMove = getPlayerMove();
        String computerMove = getComputerMove ();

        if (playerMove.equals(computerMove))
            System.out.println("Game is Tie !");
        else if (playerMove.equals(Game.ROCK))
            System.out.println(computerMove.equals(Game.PAPER) ? "Computer Wins": "Player wins");
        else if (playerMove.equals(Game.PAPER))
            System.out.println(computerMove.equals(Game.SCISSORS) ? "Computer Wins": "Player wins");
        else
            System.out.println(computerMove.equals(Game.ROCK) ? "Computer Wins": "Player wins");






    }

    public static String getComputerMove ()

    {
        String computerMove;
        Random random = new Random ();
        int input = random.nextInt(3)+1;
        if (input==1)
            computerMove = Game.ROCK;
        else if(input == 2)
            computerMove = Game.PAPER;
        else
            computerMove = Game.SCISSORS;

        System.out.println("Computer move is: " + computerMove);
        System.out.println();
        return computerMove;

    }
    public static String getPlayerMove ()
    {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        String playerMove = input.toUpperCase();
        System.out.println("Player move is: " + playerMove);
        return playerMove;

    }


}