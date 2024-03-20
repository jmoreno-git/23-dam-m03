package sets;

import java.util.Objects;

/**
 *
 * @author Jose
 */
public class Card {
    private int rank;
    private Suit suit;

    public Card(Suit suit, int rank) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.rank;
        hash = 79 * hash + Objects.hashCode(this.suit);
        return hash;
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
        final Card other = (Card) obj;
        if (this.rank != other.rank) {
            return false;
        }
        return this.suit == other.suit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Card{");
        sb.append("rank=").append(rank);
        sb.append(", suit=").append(suit);
        sb.append('}');
        return sb.toString();
    }
    
    
}
