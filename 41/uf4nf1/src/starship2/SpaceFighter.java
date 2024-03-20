
package starship2;

import java.util.Random;

/**
 *
 * @author Jose
 */
public interface SpaceFighter {

    public Random rndGenerator = new Random();
    
    public void attack(SpaceShip enemy);
    public void receiveAttack(double force);
    
}
