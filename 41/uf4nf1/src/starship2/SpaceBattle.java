package starship2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class SpaceBattle {

    private SpaceShip[] ships;

    private final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        SpaceBattle sp = new SpaceBattle();
        sp.run();
    }

    private void run() {
        generateShips();
        System.out.println("Choose the first ship: ");
        SpaceShip spaceShip1 = chooseShip();
        System.out.println("Choose the second ship: ");
        SpaceShip spaceShip2 = chooseShip();
        //
        System.out.println(spaceShip1.stateInfo());
        System.out.println(spaceShip2.stateInfo());
        int round = 1;
        do {
            //show round number
            System.out.format("===round: %d===%n",round);
            //ship1 attacks ship2
            spaceShip1.attack(spaceShip2);
            //is alived, ship2 attacks ship1
            if (spaceShip2.isAlive()) {
                spaceShip2.attack(spaceShip1);
            }
            //show both ships information
            System.out.println("Space ship 1: "+spaceShip1);
            System.out.println("Space ship 2: "+spaceShip2);
            round++;
        } while (spaceShip1.isAlive() && spaceShip2.isAlive());
        //identify looser and winner
        String loserName = (!spaceShip1.isAlive() ? spaceShip1.getName() : spaceShip2.getName());
        String winnerName = (spaceShip1.isAlive() ? spaceShip1.getName() : spaceShip2.getName());
        //report to user loser and winner
        System.out.format("%s has been destroyed, %s won the battle%n", loserName, winnerName);
    }

    private void generateShips() {
        ships = new SpaceShip[6];
        ships[0] = new Cruiser("Enterprise", 3);
        ships[1] = new Hunter("Klingon");
        ships[2] = new Cruiser("California", 3);
        ships[3] = new Hunter("Romulian");
        ships[4] = new Cruiser("Europe", 3);
        ships[5] = new Hunter("Antarian");
    }
    
    private SpaceShip chooseShip() {
        for (int i = 0; i < ships.length; i++) {
            System.out.format("%d> %s: %s%n", i, ships[i].getClass().getSimpleName(), ships[i].getName());
        }
        boolean valid = false;
        SpaceShip ship = null;
        do {
            System.out.print("Choose a ship number: ");
            try {
                int n = scan.nextInt();
                if ((n>=0) && (n<ships.length)) {
                    ship = ships[n];
                    valid = true;
                } 
            } catch (InputMismatchException e) {
                valid = false;
            }
            if (!valid) {
                System.out.println("Try again");
            }
        } while (!valid);
        return ship;
    }
    
}
