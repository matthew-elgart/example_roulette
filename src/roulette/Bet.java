package roulette;


/**
 * Represents player's attempt to bet on outcome of the roulette wheel's spin.
 * 
 * @author Robert C. Duvall
 */
<<<<<<< HEAD
abstract public class Bet {
	protected Wheel wheel;
	protected int myOdds;
	protected String myDescription;
	
	
=======
public abstract class Bet {
    private String myDescription;
    private int myOdds;

>>>>>>> 0ee3dc8cf5685afc6168da8937b5c809205a2c48
    /**
     * Constructs a bet with the given name and odds.
     * 
     * @param description name of this kind of bet
     * @param odds odds given by the house for this kind of bet
     */
    public Bet (String description, int odds, Wheel wheel) {
        this.wheel = wheel;
        myDescription = description;
        myOdds = odds;
    }

    /**
     * @return amount to pay out for winning this bet
     */
<<<<<<< HEAD
    public int getOdds () {
    	return myOdds;
=======
    public int payout (int wager) {
        return myOdds * wager;
>>>>>>> 0ee3dc8cf5685afc6168da8937b5c809205a2c48
    }

    /**
     * @return string representation of this bet
     */
<<<<<<< HEAD
    public String getDescription () {
    	return myDescription;
    }
    
    public boolean betIsMade(String betChoice) {
    	return false;
    }
    
    public String placeBet() {
    	return "";
=======
    public String toString () {
        return myDescription;
>>>>>>> 0ee3dc8cf5685afc6168da8937b5c809205a2c48
    }

    /**
     * Place bet by prompting user for the specific information need to complete this bet.
     */
    public abstract void place ();

    /**
     * Checks if bet is won or lost given result of spinning the wheel.
     *
     * @param wheel information needed to check if bet won or lost
     */
    public abstract boolean isMade (Wheel.SpinResult spinResult);
}
