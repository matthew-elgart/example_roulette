package roulette;

import util.ConsoleReader;

public class BetEvenOdd extends Bet {
	public BetEvenOdd(String description, int odds, Wheel wheel) {
		super(description, odds, wheel);
	}
	
	@Override
	public String placeBet () {
		return ConsoleReader.promptOneOf("Please bet", "even", "odd");
	}
	
	@Override
	public boolean betIsMade (String betChoice) {
		return (wheel.getNumber() % 2 == 0 && betChoice.equals("even")) ||
                (wheel.getNumber() % 2 == 1 && betChoice.equals("odd"));
	}
}
