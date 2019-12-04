package com.qa.rockpaperscissors;

import org.junit.Assert;
import org.junit.Test;

public class PlayTest {

	@Test
	public void playTest() {
		RockPaperScissors game = new RockPaperScissors();

		String result1 = game.play(State.ROCK, State.SCISSORS);
		String result2 = game.play(State.ROCK, State.PAPER);
		String result3 = game.play(State.PAPER, State.SCISSORS);
		String result4 = game.play(State.PAPER, State.ROCK);
		String result5 = game.play(State.SCISSORS, State.ROCK);
		String result6 = game.play(State.SCISSORS, State.PAPER);
		String result7 = game.play(State.ROCK, State.ROCK);
		String result8 = game.play(State.PAPER, State.PAPER);
		String result9 = game.play(State.SCISSORS, State.SCISSORS);

		Assert.assertEquals("Computer Wins", result1);
		Assert.assertEquals("User Wins", result2);
		Assert.assertEquals("User Wins", result3);
		Assert.assertEquals("Computer Wins", result4);
		Assert.assertEquals("User Wins", result5);
		Assert.assertEquals("Computer Wins", result6);
		Assert.assertEquals("Draw", result7);
		Assert.assertEquals("Draw", result8);
		Assert.assertEquals("Draw", result9);

	}

}
