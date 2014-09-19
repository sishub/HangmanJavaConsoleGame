package HangmanGame;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

public class GameEngine {

	public String WordToGuess() {
		ArrayList<String> words = ReadWordsFromFile();
		Random rand = new Random();

		int  n = rand.nextInt(words.size());
		return words.get(n);
	}

	public ArrayList<String> ReadWordsFromFile() {
		BufferedReader reader;
		ArrayList<String> wordsArr = new ArrayList<String>();
		try {
			reader = new BufferedReader(new FileReader("words.txt"));
			String line = null;
			while ((line = reader.readLine()) != null) {
				wordsArr.add(line);
			}
			reader.close();
		} catch (Exception e) {
			System.out.println("Error");
		}
		return wordsArr;
	}
	
	public String HideWord(String word){
		return word.replaceAll("[a-zA-Z]", "_ ");
	}
	
	public boolean CheckIfTheLetterIsCorrect(char letter, String word){
		char[] wordArr=word.toCharArray();
		for (int i = 0; i < wordArr.length; i++) {
			if (letter==(wordArr[i])) {
				return true;
			}
		}
		return false;
	}
}
