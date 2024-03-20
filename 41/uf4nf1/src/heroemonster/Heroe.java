package heroemonster;

import java.util.Random;

/**
 *
 * @author Jose
 */
public class Heroe {

    private final String name;
    private int level;
    private int force;
    private int lives;
    private boolean alive;

    private static Random rnd = new Random();

    public Heroe(String name, int level) {
        this.name = name;
        this.level = (level > 10) ? 10 : level;
        this.force = this.level * rnd.nextInt(1, 11);
        this.lives = 3;
        this.alive = true;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getForce() {
        return force;
    }

    public int getLives() {
        return lives;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setLevel(int level) {
        this.level = level;
        this.force = this.level * rnd.nextInt(1, 11);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Heroe other = (Heroe) obj;
        if (this.level != other.level) {
            return false;
        }
        return this.name.equalsIgnoreCase(other.name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Heroe{");
        sb.append("name=").append(name);
        sb.append(", level=").append(level);
        sb.append(", force=").append(force);
        sb.append('}');
        return sb.toString();
    }

    public void receiveImpact(int force) {
        boolean lifeLost = false;
        if ((force >= 4) && (force <= 6)) {
            this.lives--;
            lifeLost = true;
        }
        if (this.lives <= 0) {
            this.alive = false;
        }
        System.out.println(String.format("Heroe %s receives impact with force %d. Life %s", 
                name, force, (lifeLost ? "lost" : "not lost")));
    }

    public static Heroe createSuperHeroe() {
        return new Heroe("Superheroe", 10);
    }

}
