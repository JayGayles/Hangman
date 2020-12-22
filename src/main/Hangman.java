/**
 * 
 */
package main;

/**
 * @author Jay G
 *
 */
public class Hangman {

	/**
	 * @param args
	 * @return 
	 */
	public static void main(String[] args) {
		WordList myWordList;
		int myWordSize;
		String myWord;
		WordDisplay myWordDisplay;
		String myGuess;
		
		System.out.println("Hello Hangman");
		
		//Step 1 Read list of words from a file
		myWordList = new WordList("words.txt");
		if ( ! myWordList.loadWords() ) {
			System.out.println("Could not load word list from words.txt");
			return;
		}
		
		//Step 2 Get word length from user.  If 0 then quit
		myWordSize = 5;
		
		//Step 3 Select random word from list of the correct length
		myWord = myWordList.pickWord(myWordSize);
		
		//Step 4 Word is indexed and each letter becomes a user input
		myWordDisplay = new WordDisplay(myWord);
		
		//Step 5 Display word
		System.out.println( myWordDisplay.toString() );
		
		//Step 6 Ask the user to guess a letter and get guess from user
		myGuess = "I";
		//Step 6.5 If user repeats a guess print message and loop
		if (myWordDisplay.isAlreadyGuessed(myWord.charAt(0))) {
			System.out.println("You have already guessed this letter");
			continue;
		}
		//Step 7 user input is matched to each indexed letter of word if letter is a match letter is printed
		
		//Step 8 Once all letters are printed user receives congratulations message
		
		//Step 9 If user input does not match an indexed letter User is asked to repeat input.  If user has 3 incorrect attempts game over message is displayed.
		
		//Step 10 Loop to step 3
		return;
	}

}
