import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        int y;

        System.out.println("Welcome to Conway's Game of Life!");
        System.out.println("How big would you like the board?");
        System.out.print("rows: ");
        x = in.nextInt();

        System.out.print("columns: ");
        y = in.nextInt();

        Life game = new Life(x,y);

        do {
            System.out.println("Place a cell or enter -1 for either coordinate.");
            System.out.print("x coordinate: ");
            x = in.nextInt();

            System.out.print("y coordinate: ");
            y = in.nextInt();

            game.birthCell(x,y);
        } while( x >=0 && y >= 0);

        System.out.println("Your starting board:");
        System.out.println(game);

        in.nextLine();

        String next;
        System.out.println("Instructions: To advance time, hit enter. To quit, type anything before hitting enter.");
        next = in.nextLine();
        while(next.isEmpty()){
            game.advanceTime();
            System.out.println(game);
            next = in.nextLine();
        }

        System.out.println("Thanks for playing!");
    }
}