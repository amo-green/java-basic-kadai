package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		dictionary.fruitsWord();
		
		String[] fruitsArray = {"apple","banana","grape","orange"};
		
		for(String word : fruitsArray) {
			dictionary.setSearchWord(word);
			dictionary.search();
		}
	}
}
