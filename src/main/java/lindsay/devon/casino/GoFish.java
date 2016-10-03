package lindsay.devon.casino;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by devon on 10/2/16.
 */
public class GoFish extends Game {
    UserInput userInput = new UserInput();
    Menu menu  = new Menu();
    public int playerMatches = 0;
    public int houseMatches = 0;
    int round = 1;
    Deck deck;
    Player currentPlayer;
    public State state;


    public static ArrayList<Card> goFishDeck = new ArrayList<Card>();
    public ArrayList<Card> playerHand = new ArrayList<Card>();
    public ArrayList<Card> houseHand = new ArrayList<Card>();

    public GoFish(Player player) {
        this.currentPlayer = player;
        this.state = State.PLAYING;
        deck = new Deck();
        subDeck();
    }


    public void play() {
        while(round < 5) {
            deal();
            Card playerGuessCard = deck.getCardByName(playerGuess());
            if(houseHand.contains(playerGuessCard)) {
                a
            }

        }
//            //player make guess .contains
//            // if correct cards get removed from hand; playerMatches ++;
//            //house make guess .contains
//            // if correct cards get removed from hand; houseMatches ++;
//        }
//        setGameState();

    }


    public void subDeck() {
        for(int i = 0; i < deck.deckList.size(); i++) {
            if(deck.deckList.get(i).getValue() > 9){
                Card card = deck.deckList.get(i);
                goFishDeck.add(card);
            }
        }
    }

    public void deal() {
        Random random = new Random();

        for(int i = 0; i < 7 ; i++) {
            int num = random.nextInt(20);
            Card card = goFishDeck.get(num);
            playerHand.add(card);
            int num2 = random.nextInt(20);
            Card card2 = goFishDeck.get(num2);
            houseHand.add(card2);
        }
    }

    public String playerGuess() {
        menu.output("Please enter your guess: Card Name and Suit (i.e. 'Jack of Clubs')");
        String playerGuess = userInput.inputString();
        return playerGuess;

    }

    public void houseGuess() {
        Random random = new Random();
        int num = random.nextInt(20);
        String houseGuess = goFishDeck.get(num).getName();
    }


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
        //updatePlayerBalance();
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
