package HangmanGame;

public class Messages {

	public void StartGame() {
		System.out.println("-------------------------------");
		System.out.println("-------  Hangman Game! --------");
		System.out.println("-------------------------------");
	}

	public void CanYouGuessTheWord() {
		System.out.println();
		System.out.println("Can you guess the word below?");
		System.out.println();

	}

	public void GameOverMessage(String message, String word, boolean guess) {
		if (guess) {
			System.out.println(message);
		} else {
			System.out.printf("%s \"%s\".", message, word);
		}
		System.out.println();
	}
}
