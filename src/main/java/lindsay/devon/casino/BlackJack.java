package lindsay.devon.casino;

/**
 * Created by devon on 10/2/16.
 */
public class BlackJack extends Game {

    Player currentPlayer;
    State state;


    public BlackJack(Player player) {
        this.currentPlayer = player;
        this.state = State.PLAYING;
        play();
    }

    public void play() {}
    public void setGameState() {}
    public void updatePlayerBalance() {}
    public void placeBet(double currentBet) {}
}
