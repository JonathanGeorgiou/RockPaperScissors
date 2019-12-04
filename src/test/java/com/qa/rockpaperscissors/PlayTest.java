package com.qa.rockpaperscissors;
import java.awt.Choice;

import org.junit.Assert;
import org.junit.Test;

public class PlayTest {

	@Test
	public void playTest() {
		RockPaperScissors game = new RockPaperScissors();

		String result1 = game.play(Choice.ROCK, Choice.SCISSORS);
		String result2 = game.play(Choice.ROCK, Choice.PAPER);
		String result3 = game.play(Choice.PAPER, Choice.SCISSORS);
		String result4 = game.play(Choice.PAPER, Choice.ROCK);
		String result5 = game.play(Choice.SCISSORS, Choice.ROCK);
		String result6 = game.play(Choice.SCISSORS, Choice.PAPER);

		Assert.assertEquals("Computer Wins", result1);
		Assert.assertEquals("User Wins", result2);
		Assert.assertEquals("User Wins", result3);
		Assert.assertEquals("Computer Wins", result4);
		Assert.assertEquals("User Wins", result5);
		Assert.assertEquals("Computer Wins", result6);

	}

}
