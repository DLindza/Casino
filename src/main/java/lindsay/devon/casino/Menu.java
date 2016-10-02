package lindsay.devon.casino;

/**
 * Created by devon on 10/2/16.
 */
public class Menu {

    public void output(String msg) {
        System.out.println(msg);
    }
    public void output(double num) { System.out.println(num); }

    public void welcomeMenu(){
        output("XXXXXXXXXXXXXXXXXXXXXXXXXX");
        output("Welcome to Devon's Casino!");
        output("Where all your dreams come true.");
        output("XXXXXXXXXXXXXXXXXXXXXXXXXX");
        output("");
        output("What would you game would you like to play today?"); //userPromptInt
        output(" [1] Become a player!"); // Create new Player -- ENGINE
        //usepromptString x3 - first name, last name, password
        output(" [2] Already a player? Play a game!");
        //  prompt user for password -- get PlayerByPIN -- ENGINE
        // Game Menu
        output(" [3] Exit");

    }

    public void gameMenu() {
        // current Player
        output("What game would you like to play today?"); //userPromptInt
        output(" [1] Roulette!");  //Roulette Main Menu
        output(" [2] Go Fish!"); //Go Fish Menu
        output(" [3] Black Jack!");  // Black Jack Menu
        output(" [4] Exit"); // return to Welcome Menu
    }


    public void rouletteMenu() {
        output("XXXXXXXXXXXXXXXXXXXXXXXXXX");
        output("Welcome to Roulette");
        output("XXXXXXXXXXXXXXXXXXXXXXXXXX");
        output(""); // userPromptInt
        output(" [1] Rules"); // rouletteRules
        output(" [2] Play a game!"); //play Roulette
        output(" [3] Exit"); // break out to return to Game Menu
    }

    public void rouletteRules() {
        output("Welcome to Roulette!");
        output("under construction");
        output("");
        output("BETTING:");
        output("under construction");

    }

    public void goFishMenu() {
        output("XXXXXXXXXXXXXXXXXXXXXXXXXX");
        output("Welcome to Go Fish!");
        output("XXXXXXXXXXXXXXXXXXXXXXXXXX");
        output(""); // userPromptInt
        output(" [1] Rules"); // rouletteRules
        output(" [2] Play a game!"); //play Roulette
        output(" [3] Exit"); // break out to return to Game Menu
    }


    public void goFishRules() {
        output("Welcome to Go Fish!");
        output("Rules: You will be dealt 5 cards and the House will be dealt 5 cards");
        output("The cards will be of values 9 through King");
        output("You will take turns guessing if a card is currently in the other player's hand.");
        output("A match is a card of equal value and the same color");
        output("");
        output("BETTING:");
        output("You will place an initial bet");
        output("For every match that you get more than the computer you will get your bet back");
        output("plus your bet amount times the number of pairs.");

    }
    public void blackJackMenu() {
        output("XXXXXXXXXXXXXXXXXXXXXXXXXX");
        output("Welcome to BlackJack");
        output("XXXXXXXXXXXXXXXXXXXXXXXXXX");
        output(""); // userPromptInt
        output(" [1] Rules"); // rouletteRules
        output(" [2] Play a game!"); //play Roulette
        output(" [3] Exit"); // break out to return to Game Menu
    }

    public void blackJackRules() {
        output("Welcome to Black Jack!");
        output("under construction");
        output("");
        output("BETTING:");
        output("under construction");
    }
}
