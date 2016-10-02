package lindsay.devon.casino;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by devon on 10/2/16.
 */
public class Player {
    int playerID;
    String firstName;
    String lastName;
    String pin;
    double balance = 0;
    HashSet<Deck> hand;

    Player(int playerID, String firstName, String lastName, String pin) {
        this.playerID = playerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin =  pin;
    }

    public int getPlayerID() {
        return this.playerID;
    }

    public String getPin() {
        return this.pin;
    }

    public double getBalance() { return this.balance;}

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public HashSet<Deck> getHand() { return this.hand;}

    public void setHand(HashSet<Deck> hand) {
        this.hand = hand;
    }
}
