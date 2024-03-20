package starship2;

/**
 *
 * @author Jose
 */
public class Cruiser extends SpaceShip {

    private int numPhotonTorpedo;
    
    private static final double INITIAL_ENERGY = 100.0;
    private static final double SHIELD_ENERGY_RATIO = 0.45;
    private static final double MAX_LASER_ENERGY_ATTACK = 50.0;
    private static final double PAIN_FACTOR = 0.20;
    
    private static final double TORPEDO_FORCE = 75.0;

    public Cruiser(String name, int numPhotonTorpedo) {
        super(name, INITIAL_ENERGY, SHIELD_ENERGY_RATIO);
        this.numPhotonTorpedo = numPhotonTorpedo;
    }

    public double getShieldEnergy() {
        return energy * SHIELD_ENERGY_RATIO;
    }

    public double getLaserGunEnergy() {
        return energy * (1.0 - SHIELD_ENERGY_RATIO);
    }

    @Override
    public void attack(SpaceShip enemy) {
        double force;
        boolean attackWithTorpedo = (numPhotonTorpedo > 0);
        attackWithTorpedo &= rndGenerator.nextBoolean();
        if (attackWithTorpedo) {
            force = TORPEDO_FORCE;
            numPhotonTorpedo--;
        } else {
            double fraction = rndGenerator.nextDouble();
            force = Math.min(fraction * getLaserGunEnergy(), MAX_LASER_ENERGY_ATTACK);
        }
        System.out.println(attackInfo(force, attackWithTorpedo));
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

    public String attackInfo(double force, boolean attackType) {
        Weapon weapon = (attackType ? Weapon.PHOTONIC_TORPEDO : Weapon.LASER_GUN);
        String msg = String.format("Cruiser %s attacks with force %.2f with weapon %s", name, force, weapon);
        return msg;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cruiser{");
        sb.append("name=").append(name);
        sb.append(", energy=").append(String.format("%.2f",energy));
        sb.append(", numPhotonTorpedo=").append(numPhotonTorpedo);
        sb.append(", alive=").append(alive);
        sb.append('}');
        return sb.toString();
    }

}
