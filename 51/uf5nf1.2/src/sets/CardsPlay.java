package sets;

import java.util.Collections;

/**
 *
 * @author Jose
 */
public class CardsPlay {

    public static void main(String[] args) {
        Deck deck1 = new Deck();
        System.out.println("deck1: "+deck1.getCards());
        System.out.println("deck1.getCards().size(): "+deck1.getCards().size());
        Collections.shuffle(deck1.getCards());
        System.out.println("deck1: "+deck1.getCards());
        
    }
    
}
