package com.qa.rockpaperscissors;

import java.util.Random;

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
			return "its a draw";
		} else {
			return "Computer Wins";
		}

	}

	public State randComputerChoice() {
		int pick = new Random().nextInt(State.values().length);
		return State.values()[pick];
	}

}
