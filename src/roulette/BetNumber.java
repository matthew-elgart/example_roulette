package roulette;

import util.ConsoleReader;

public class BetNumber extends Bet {
	public BetNumber(String description, int odds, Wheel wheel) {
		super(description, odds, wheel);
	}
	
	@Override
	public String placeBet () {
		return "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
                1, Wheel.NUM_SPOTS - 3);
	}
	
	@Override
	public boolean betIsMade (String betChoice) {
		int start = Integer.parseInt(betChoice);
        return (start <= wheel.getNumber() && wheel.getNumber() < start + 3);
	}
}
