package roulette;

import roulette.bets.OddEven;
import roulette.bets.RedBlack;
import roulette.bets.ThreeConsecutive;
import util.ConsoleReader;


/**
 * Plays a game of roulette.
 * 
 * @author Robert C. Duvall
 */
public class Game {
    // name of the game
    private static final String DEFAULT_NAME = "Roulette";
<<<<<<< HEAD
    // bets player can make
    private Wheel myWheel;
    private Bet[] myPossibleBets = { 
        new BetColor("Red or Black", 1, myWheel),
        new BetEvenOdd("Odd or Even", 1, myWheel),
        new BetNumber("Three in a Row", 11, myWheel)
=======
    // add new bet subclasses here
    private Bet[] myPossibleBets = {
        new RedBlack("Red or Black", 1),
        new OddEven("Odd or Even", 1),
        new ThreeConsecutive("Three in a Row", 11),
>>>>>>> 0ee3dc8cf5685afc6168da8937b5c809205a2c48
    };
    

    /**
     * Construct the game.
     */
    public Game () {
        myWheel = new Wheel();
    }

    /**
     * @return name of the game
     */
    public String getName () {
        return DEFAULT_NAME;
    }

    /**
     * Play a round of roulette.
     *
     * Prompt player to make a bet, then spin the roulette wheel, and then verify 
     * that the bet is won or lost.
     *
     * @param player one that wants to play a round of the game
     */
    public void play (Gambler player) {
        int amount = ConsoleReader.promptRange("How much do you want to bet",
                                               0, player.getBankroll());
<<<<<<< HEAD
        Bet whichBet = promptForBet();
        String betChoice = placeBet(whichBet);
=======
        Bet b = promptForBet();
        b.place();
>>>>>>> 0ee3dc8cf5685afc6168da8937b5c809205a2c48

        System.out.print("Spinning ...");
        Wheel.SpinResult spinResult = myWheel.spin();
        System.out.println(String.format("Dropped into %s", spinResult));
        if (b.isMade(spinResult)) {
            System.out.println("*** Congratulations :) You win ***");
<<<<<<< HEAD
            amount *= whichBet.getOdds();
=======
            amount = b.payout(amount);
>>>>>>> 0ee3dc8cf5685afc6168da8937b5c809205a2c48
        }
        else {
            System.out.println("*** Sorry :( You lose ***");
            amount *= -1;
        }
        player.updateBankroll(amount);
    }

    /**
     * Prompt the user to make a bet from a menu of choices.
     */
    private Bet promptForBet () {
        System.out.println("You can make one of the following types of bets:");
        for (int k = 0; k < myPossibleBets.length; k++) {
<<<<<<< HEAD
            System.out.println(String.format("%d) %s", (k + 1), myPossibleBets[k].getDescription()));
        }
        return myPossibleBets[ConsoleReader.promptRange("Please make a choice", 1, myPossibleBets.length) - 1];
    }

    /**
     * Place the given bet by prompting user for specific information need to complete that bet.
     *
     * @param whichBet specific bet chosen by the user
     */
    private String placeBet (Bet whichBet) {
        /*String result = "";
        if (whichBet == 0) {
            result = ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
        }
        else if (whichBet == 1) {
            result = ConsoleReader.promptOneOf("Please bet", "even", "odd");
        }
        else if (whichBet == 2) {
            result = "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
                                                    1, Wheel.NUM_SPOTS - 3);
        }
        System.out.println();
        return result;*/
    	return whichBet.placeBet();
    }

    /**
     * Checks if the given bet is won or lost given user's choice and result of spinning the wheel.
     *
     * @param whichBet specific bet chosen by the user
     * @param betChoice specific value user chose to try to win the bet
     */
    private boolean betIsMade (Bet whichBet, String betChoice) {
        /*if (whichBet == 0) {
            return myWheel.getColor().equals(betChoice);
        }
        else if (whichBet == 1) {
            return (myWheel.getNumber() % 2 == 0 && betChoice.equals("even")) ||
                   (myWheel.getNumber() % 2 == 1 && betChoice.equals("odd"));
        }
        else if (whichBet == 2) {
            int start = Integer.parseInt(betChoice);
            return (start <= myWheel.getNumber() && myWheel.getNumber() < start + 3);
        }
        else {
            return false;
        }*/
    	return whichBet.betIsMade(betChoice);
=======
            System.out.println(String.format("%d) %s", (k + 1), myPossibleBets[k]));
        }
        int response = ConsoleReader.promptRange("Please make a choice", 1, myPossibleBets.length);
        return myPossibleBets[response - 1];
>>>>>>> 0ee3dc8cf5685afc6168da8937b5c809205a2c48
    }
}
