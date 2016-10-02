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


    public void accountsMainMenu() {
        // select Account to make a transaction on
        // current account
        // validate current account is open
        output("What would you like to do today?"); // userPromptInt
        output(" [1] Make a deposit");
        //userprompt transactionAmt
        // deposit - ENGINE
        // print balance - ENGINE
        output(" [2] Make a withdrawal");
        //userprompt transactionAmt
        // withdraw - ENGINE
        // print balance - ENGINE
        output(" [3] Transfer funds");
        //userprompt transactionAmt
        // deposit - ENGINE
        // print balance - ENGINE
        output(" [4] Check my balance"); // print balance - ENGINE
        output(" [5] Get transaction history"); // print transactions - ENGINE
        output(" [6] Exit"); // return to Welcome Menu
    }
}
