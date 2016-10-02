package lindsay.devon.casino;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by devon on 10/2/16.
 */
public class GoFish extends Game {
    int playerMatches = 0;
    int houseMatches = 0;
    int round = 1;
    Deck deck;
    Player currentPlayer;
    public State state;

    ArrayList<Card> goFishDeck;
    ArrayList<Card> playerHand;
    ArrayList<Card> houseHand;

    public GoFish(Player player) {
        this.currentPlayer = player;
        this.state = State.PLAYING;
        //deck = new Deck();
       // subDeck();
        play();
    }


    public void play() {
        while(round < 5) {
            //deal player hand - 5 cards int ID < 9
            //deal house hand - 5 cards int ID < 9
            //player make guess .contains
            // if correct cards get removed from hand; playerMatches ++;
            //house make guess .contains
            // if correct cards get removed from hand; houseMatches ++;
        }
        setGameState();

    }


    public void subDeck() {
        for(int i = 0; i < Deck.deckList.size(); i++) {
            if (Deck.deckList.get(i).value > 9){
                goFishDeck.add(Deck.deckList.get(i));
            }
        }


    }

    public void deal() {


    }
    public void guess() {}


    public void setGameState() {
        if(houseMatches > playerMatches) {
            this.state = State.LOSS;
            System.out.println("Sorry, you lost");
        } else if (houseMatches == playerMatches) {
            this.state = State.TIE;
            System.out.println("It was a tie!");
        } else {
            this.state = State.WIN;
            System.out.println("WINNER! WIN! YOU WON! GO YOU! WAHOOO!");
        }
        updatePlayerBalance();
    }

    public void updatePlayerBalance() {
        if(this.state.equals(State.WIN)) {
            this.currentPlayer.addBalance(this.pot);
        } else if (this.state.equals(State.TIE)) {
            this.currentPlayer.addBalance(this.currentBet);
        } else {
            this.currentPlayer.subtractBalance(this.pot);
        }
        System.out.println("Your current balance is now " + currentPlayer.getBalance());
    }

    public void placeBet(double bet) {
        if(bet > currentPlayer.getBalance()) {
            this.currentPlayer.subtractBalance(bet);
            this.currentBet = bet;
        } else {
            System.out.println("Sorry, you currently do not have enough on your tab.");
        }


    }
}
