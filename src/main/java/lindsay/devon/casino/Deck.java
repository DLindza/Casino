package lindsay.devon.casino;

import java.util.HashSet;

/**
 * Created by devon on 10/2/16.
 */
public class Deck {

     public static HashSet<Card> deckList;

     public Deck() {
       this.deckList  = new HashSet<Card>();
       createNewDeck();
     }

    void createNewDeck() {
        for (int i = 1; i < 14; i++) {
            Card heart = new Card(i, Card.Suit.HEARTS);
            Card club = new Card(i, Card.Suit.CLUBS);
            Card spade = new Card(i, Card.Suit.SPADES);
            Card diamond = new Card(i, Card.Suit.DIAMONDS);

            deckList.add(heart);
            deckList.add(club);
            deckList.add(spade);
            deckList.add(diamond);
        }
    }
}

class Card {
    int id;
    public enum Suit {HEARTS, CLUBS, SPADES, DIAMONDS}
    Suit suit;
    int value;
    String name;

    Card(int id, Suit suit) {
        this.id = id;
        this.suit = suit;
        this.value = setValue(id);
        this.name = setName(id);
    }

    int setValue(int id) {
       for (int i = id; i <14; i++) {
            if (i == 1) {
                this.value = 11;
            } else if (i > 10) {
                this.value = 10;
            } else {
                this.value = i;
            }
        }
        return this.value;
    }

    String setName(int id) {
        for (int i = id; i < 14; i++) {
            if (i == 1) {
                this.name = "Ace of " + this.suit;
            } else if(i == 11) {
                this.name = "Jack of "  + this.suit;
            } else if(i == 12) {
                this.name = "Queen of " + this.suit;
            } else if(i == 13) {
                this.name = "King of " + this.suit;
            } else { this.name = i + " " + this.suit;}
        }
        return this.name;
    }

}