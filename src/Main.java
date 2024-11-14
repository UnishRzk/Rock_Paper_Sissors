import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);



        while (true) {
            String[] rps = {"r", "p", "s"};
            String PlayerMove;
            String ComputerMove = rps[rand.nextInt(rps.length)];

            while (true) {
                System.out.print("Please Enter your move 'r','p','s': ");
                PlayerMove = sc.nextLine();

                if (PlayerMove.equals("r") || PlayerMove.equals("p") || PlayerMove.equals("s")) {
                    break;
                } else {
                    System.out.println(PlayerMove + " is not a valid move");
                }

            }

            System.out.println("You Played: "+PlayerMove);
            System.out.println("Computer Played: " + ComputerMove);

            if (ComputerMove.equals(PlayerMove)) {
                System.out.println("Tie ");
            } else if (PlayerMove.equals("r")) {
                if (ComputerMove.equals("p")) {
                    System.out.println("You Lose");
                } else if (ComputerMove.equals("s")) {
                    System.out.println("You Win");
                }
            } else if (PlayerMove.equals("p")) {
                if (ComputerMove.equals("r")) {
                    System.out.println("You Win");
                } else if (ComputerMove.equals("s")) {
                    System.out.println("You Lose");
                }
            } else if (PlayerMove.equals("s")) {
                if (ComputerMove.equals("p")) {
                    System.out.println("You Win");
                } else if (ComputerMove.equals("r")) {
                    System.out.println("You Lose");
                }
            }

            System.out.println("Do You want to continue (y/n)");
            String response = sc.nextLine();

            System.out.println("\n\n\n\n");
            if (response.equals("n")) {
                break;
            }



        }


        }
}