package com.qa.rockpaperscissors;

public class RockPaperScissors {

	public String play(State computerChoice, State userChoice) {
		if (computerChoice.equals(State.SCISSORS) && userChoice.equals(State.ROCK)) {
			return "User Wins";
		}
		if (computerChoice.equals(State.ROCK) && userChoice.equals(State.PAPER)) {
			return "User Wins";
		}
		if (computerChoice.equals(State.PAPER) && userChoice.equals(State.SCISSORS)) {
			return "User Wins";
		}
		if (computerChoice.equals(userChoice)) {
			return "Draw";
		} else {
			return "Computer Wins";
		}

	}

}
