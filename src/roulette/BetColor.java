package roulette;

import util.ConsoleReader;

public class BetColor extends Bet {
	public BetColor(String description, int odds, Wheel wheel) {
		super(description, odds, wheel);
	}
	
	@Override
	public String placeBet () {
		return ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
	}
	
	@Override
	public boolean betIsMade (String betChoice) {
        return wheel.getColor().equals(betChoice);
	}
}
