package sets;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose
 */
public class Deck {

    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        initialize();
    }

    public List<Card> getCards() {
        return cards;
    }

    private void initialize() {
        for (Suit suit : Suit.values()) {
            for (int i = 1; i <= 13; i++) {
                cards.add(new Card(suit, i));
            }
        }
    }

}
