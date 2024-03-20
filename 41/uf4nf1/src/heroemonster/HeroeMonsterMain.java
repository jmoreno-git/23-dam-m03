package heroemonster;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class HeroeMonsterMain {

    private static final Scanner scan = new Scanner(System.in);
    private static final Random rnd = new Random();
    
    public static void main(String[] args) {
        //create fighters
        System.out.print("Heroe name: ");
        String heroeName = scan.next();
        int heroeLevel = rnd.nextInt(1, 5);
        Heroe heroe = new Heroe(heroeName, heroeLevel);
        int monsterScreen = rnd.nextInt(1, 7);
        Monster monster = new Monster(monsterScreen);
        //show state of characters
        System.out.println("Heroe: "+heroe);
        System.out.println("Monster: "+monster);
        while (heroe.isAlive() && monster.isAlive()) {
            //heroe attack
            monster.receiveImpact(heroe.getForce());
            if (monster.isAlive()) {
                int monsterAttackForce = monster.hugeAttack();
                heroe.receiveImpact(monsterAttackForce);
            }
            
        }
        //show state of characters
        System.out.println("Heroe: "+heroe);
        System.out.println("Monster: "+monster);
        if (heroe.isAlive()) {
            System.out.format("Heroe %s wins%n", heroe.getName());
        } else {
            System.out.format("Monster %s wins%n", monster.getName());
        }
    }
    
}
