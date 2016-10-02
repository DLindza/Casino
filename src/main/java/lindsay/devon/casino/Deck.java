package lindsay.devon.casino;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by devon on 10/2/16.
 */
public class Deck {

     public static ArrayList<Card> deckList;

     public Deck() {
       this.deckList  = new ArrayList<Card>();
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

    void shuffleDeck() {

    }
}

