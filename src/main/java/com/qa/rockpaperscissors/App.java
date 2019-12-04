package com.qa.rockpaperscissors;

public class App {

	public static void main(String[] args) {

		RockPaperScissors game = new RockPaperScissors();
		State comp = game.randComputerChoice();
		State user = State.ROCK;
		System.out.println("Computer: " + comp + " " + "User: " + user + " " + "Therefore " + game.play(comp, user));

	}

}
