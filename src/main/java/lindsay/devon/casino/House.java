package lindsay.devon.casino;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by devon on 10/2/16.
 */
public class House {
    HashSet<Deck> hand;

    public HashSet<Deck> getHand() { return this.hand;}

    public void setHand(HashSet<Deck> hand) {
        this.hand = hand;
    }
}
