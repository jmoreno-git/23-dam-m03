package heroemonster;

import java.util.Random;

/**
 *
 * @author Jose
 */
public class Monster {

    private final String name;
    private int screen;
    private int lives;
    private int superAttack;
    private boolean alive;

    private Random rnd = new Random();

    public Monster(int screen) {
        this.screen = screen;
        this.name = String.format("Monster of screen %d", this.screen);
        this.lives = this.screen * 10;
        this.superAttack = this.screen;
        this.alive = true;
    }

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return alive;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Monster{");
        sb.append("name=").append(name);
        sb.append(", lives=").append(lives);
        sb.append(", superAttack=").append((superAttack > 0) ? "Has super attack" : "Does not have super attack");
        sb.append('}');
        return sb.toString();
    }

    public void receiveImpact(int force) {
        this.lives--;
        if (this.lives <= 0) {
            this.alive = false;
        }
        System.out.println(String.format("Monster %s receives impact with force %d. 1 life lost", 
                name, force));
    }
    
    public int hugeAttack() {
        boolean superAttackLost = false;
        int force = rnd.nextInt(1, 11);
        if ((superAttack > 0) && ((force < 4) || (force > 6))) {
            force = rnd.nextInt(1, 11);
            superAttack--;
            superAttackLost = true;
        }
        System.out.println(String.format("Monster %s attacks with force %d. Super attack %s", 
                name, force, (superAttackLost ? "lost" : "not lost")));
        return force;
    }

}
