/**
 * 
 */
package main;

/**
 * @author Jay G
 *
 */
public class WordList {
	private String wordFileName;
	private String[] wordArray;
	private int wordCount;
	
	//Construct a word list for a file name
	public WordList(String aFileName) {
		this.wordFileName = aFileName;
		this.wordArray = null;
		this.wordCount = 0;
	}

	//Load the words from a file into word array
	//Return true if words are loaded, False if not
	public Boolean loadWords() {
		Boolean returnValue = false;
		//Open the file
		//Count the lines in the file
		//Create word array of the proper size
		//Load the lines into the array
		//Close the file
		return returnValue;
	}
	
	//Pick a random word of given length
	//Return the chosen word, or null if no word is chosen
	public String pickWord(int aWordLength) {
		String returnValue = null;
		//Pick a random number between 0 and word count -1
		//If size of word = wordLength return words else loop
		//If too many tries, print error message and return null
		
		return returnValue;
	}
}
