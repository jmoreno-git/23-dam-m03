package starship2;

/**
 *
 * @author Jose
 */
public class Hunter extends SpaceShip {

    private static final double INITIAL_ENERGY = 150.0;
    private static final double SHIELD_ENERGY_RATIO = 0.4;
    private static final double MAX_LASER_ENERGY_ATTACK = 40.0;
    private static final double PAIN_FACTOR = 0.25;

    public Hunter(String name) {
        super(name, INITIAL_ENERGY, SHIELD_ENERGY_RATIO);
    }

    public double getShieldEnergy() {
        return energy * SHIELD_ENERGY_RATIO;
    }

    public double getLaserGunEnergy() {
        return energy * (1.0 - SHIELD_ENERGY_RATIO);
    }
    
    @Override
    public void attack(SpaceShip enemy) {
        double fraction = rndGenerator.nextDouble();
        double force = Math.min(fraction * getLaserGunEnergy(), MAX_LASER_ENERGY_ATTACK);
        System.out.println(attackInfo(force));
        enemy.receiveAttack(force);
    }

    @Override
    public void receiveAttack(double force) {
        if (alive) {
            double pain = force * PAIN_FACTOR;
            alive = (pain < getShieldEnergy());
            if (alive) {
                energy -= pain;
            } else {
                energy = 0.0;
            }
        }
        System.out.println(stateInfo());
    }

    public String attackInfo(double force) {
        String msg = String.format("Hunter %s attacks with force %.2f", name, force);
        return msg;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hunter{");
        sb.append("name=").append(name);
        sb.append(", energy=").append(String.format("%.2f",energy));
        sb.append(", alive=").append(alive);
        sb.append('}');
        return sb.toString();
    }

}
