package HangmanGame;

import java.util.Scanner;

public class HangmanGame {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Messages message = new Messages();
		GameEngine gameEngine = new GameEngine();
		int numberOfGuesses = 5;
		int countGuesses = 0;
		String word = gameEngine.WordToGuess();
		String hiddenWord = gameEngine.HideWord(word);
		message.StartGame();
		message.CanYouGuessTheWord();
		System.out.println(gameEngine.AddSpaces(hiddenWord));
		System.out.println();

		while (true) {
			Scanner input = new Scanner(System.in);
			char letter = input.next().charAt(0);
			
			boolean foundLetter = gameEngine.CheckIfTheLetterIsCorrect(letter,
					word);

			if (foundLetter) {
				hiddenWord = gameEngine.PlaceLetterInTheHiddenWord(letter,
						word, hiddenWord);
				System.out.println(gameEngine.AddSpaces(hiddenWord));
			}
			else {
				countGuesses++;
			}

			if (hiddenWord.equals(word)) {
				message.GameOverMessage("Cool! You are a genius!", word, true);
				gameEngine.EndGame();
			}
			if (countGuesses == numberOfGuesses) {
				message.GameOverMessage("You loose! The word you couldn't guess was", word, false);
				gameEngine.EndGame();
			}
		}
	}

}
