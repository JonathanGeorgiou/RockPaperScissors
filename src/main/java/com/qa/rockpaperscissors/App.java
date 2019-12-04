package com.qa.rockpaperscissors;

public class App {

	public static void main(String[] args) {

		RockPaperScissors game = new RockPaperScissors();
		State comp = game.randComputerChoice();
		State user = State.PAPER;
		System.out.println(
				"Computer picked " + comp + " " + "and user picked " + user + " " + "so " + game.play(comp, user));

	}

}
