package com;

import printer.Output;

public class MainClass {
	public static void main(String args[]) {
		Player playerOne = new Player("Player One");
		Player playerTwo = new Player("Player Two");
		
		Player batting = playerOne;
		Player bowling = playerTwo;
		
		Output output = null;
		
		output.consolePrintNewLine("First Innings");
		
		String battingBowlingMessage = playerOne.getPlayerName() + " is batting first and " + playerTwo.getPlayerName() + " is bowling first ";
		output.consolePrintNewLine(battingBowlingMessage);
		
		Game gameOne = new Game();
		gameOne.startGame(batting, bowling, 0);
		
		output.consolePrintNewLine(" ");
		output.consolePrintNewLine("Second Innings");
		
		batting = playerTwo;
		bowling = playerOne;
		
		Game gameTwo = new Game();
		gameTwo.startGame(batting, bowling, 1);
		
		Game game = new Game();
		Player winner = game.gameWinner(playerOne, playerTwo);
		
		if(winner != null) {
			String winnerMessage = "\n"+ winner.getPlayerName() + " is the winner!";
			output.consolePrintNewLine(winnerMessage);
		}
		else {
			String tieMessage = playerOne.getPlayerName() + " and " + playerTwo.getPlayerName() + " both scores are tie!";
			output.consolePrintNewLine(tieMessage);
		}
	}
}
