# example_roulette
Program to refactor that plays a game of roulette
Names: Matt Elgart and Jiadong Yin

1. The refactored code is simpler because there are no redundancies in if statements checking for which type of bet is required when calling placeBet() or betIsMade().
2. The refactored code is more complex because it adds three new classes that are subclasses of the Bet class and implement their own versions of the placeBet() and betIsMade() methods.
3. We made the tradeoff between the greater readaability of the new version and the fact that it is slightly more difficult to track down the methods across various classes.
4. We prefer the newer version because it is easier to read, and easier to follow the logic of the code without having to parse through redundancies in code.