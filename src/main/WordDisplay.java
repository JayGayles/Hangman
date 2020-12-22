/**
 * 
 */
package main;

/**
 * @author Jay G
 *
 */
public class WordDisplay {
	private int wordSize;
	private char[] word;
	private char[] display;
	private char[] guesses;
	private int guessCount;
	private int badGuesses;
	
	//Construct a word display for a given word
	public WordDisplay(String aWord) {
		wordSize = aWord.length();
		word = new char[wordSize];
		display = new char[wordSize];
		for (int idx = 0; idx < wordSize; idx++) {
			word[idx] = aWord.charAt(idx);
			display[idx] = '_';
		}
		guesses = new char[26];
		for (int idx = 0; idx < 26; idx++) {
			guesses[idx] = '\0';
		}
		guessCount = 0;
		badGuesses = 0;
	}
	
	//Check if letter guessed was guessed before
	public Boolean isAlreadyGuessed(char aLetterGuessed) {
		Boolean returnVal = false;
		for (int idx = 0; idx < guessCount; idx++) {
			if (guesses[idx] == aLetterGuessed) {
				returnVal = true;
			}
		}
		return returnVal;
	}
	
	//Return a string with the current display
	public String toString() {
		String returnVal = "";
		for (int idx = 0; idx < wordSize; idx++) {
			if (idx == 0) {
				returnVal += display[idx];
			} else {
				returnVal += " " + display[idx]; 
			}
		}
		return returnVal;
	}
	
}
