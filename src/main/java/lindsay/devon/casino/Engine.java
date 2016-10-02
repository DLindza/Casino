package lindsay.devon.casino;

/**
 * Created by devon on 10/2/16.
 */
public class Engine {
    PlayerManager playerManager = new PlayerManager();


    public Player createNewPlayer(String firstName, String lastName, String pin) {
        Player newPlayer = playerManager.createPlayer(firstName, lastName, pin);
        return newPlayer;
    }

    public Player getPlayerByPIN(int playerID, String password) {
        Player currentPlayer = playerManager.getPlayerByPIN(playerID, password);
        return currentPlayer;
    }

    public int getPlayerID(Player newPlayer) {
        return playerManager.getPlayerID(newPlayer);
    }

    public double getBalance(Player currentPlayer) { return playerManager.getPlayerBalance(currentPlayer);}

    public void setInitialPlayerBalance(Player currentPlayer, double Balance) { playerManager.setPlayerBalance(currentPlayer,Balance);}

    public void playGame(Game game) { game.play(); }

    public Roulette createRoulette(Player player) { return new Roulette(player);}
    public BlackJack createBlackJack(Player player) { return new BlackJack(player);}
    public GoFish createGoFish(Player player) { return new GoFish(player);}

    public void placePlayerBet(double bet, Game game) {game.placeBet(bet);}

}