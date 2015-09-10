package roulette;


/**
 * Represents player's attempt to bet on outcome of the roulette wheel's spin.
 * 
 * @author Robert C. Duvall
 */
abstract public class Bet {
	protected Wheel wheel;
	protected int myOdds;
	protected String myDescription;
	
	
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
     * @return odds given by the house for this kind of bet
     */
    public int getOdds () {
    	return myOdds;
    }

    /**
     * @return name of this kind of bet
     */
    public String getDescription () {
    	return myDescription;
    }
    
    public boolean betIsMade(String betChoice) {
    	return false;
    }
    
    public String placeBet() {
    	return "";
    }
}
