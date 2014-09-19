package HangmanGame;

import java.util.Scanner;

public class HangmanGame {

	public static void main(String[] args) {

		Messages message = new Messages();
		GameEngine gameEngine = new GameEngine();

		String word = gameEngine.WordToGuess();

		message.StartGame();
		message.CanYouGuessTheWord();
		System.out.println(gameEngine.HideWord(word));
		System.out.println();

		while (true) {
			Scanner input = new Scanner(System.in);
			char letter = input.next().charAt(0);
			gameEngine.CheckIfTheLetterIsCorrect(letter, word);
			
			
		}
	}

}
