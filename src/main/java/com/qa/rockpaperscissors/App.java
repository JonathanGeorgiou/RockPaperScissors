package com.qa.rockpaperscissors;

public class App {

	public static void main(String[] args) {

		RockPaperScissors game = new RockPaperScissors();
		game.play(game.randComputerChoice(), State.ROCK);

	}

}
