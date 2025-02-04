package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	String word; //フィールド
	
	HashMap<String,String> fruit = new HashMap<String,String>();
	
	
	public void fruitsWord() {
			fruit.put("apple","リンゴ");
			fruit.put("peach","桃");
			fruit.put("banana","バナナ");
			fruit.put("lemon","レモン");
			fruit.put("pear","梨");
			fruit.put("kiwi","キウイ");
			fruit.put("stawberry","いちご");
			fruit.put("grape","ぶどう");
			fruit.put("muscat","マスカット");
			fruit.put("cherry","さくらんぼ");
	}
	
	public void setSearchWord(String word) {
		this.word = word;
	}
	//辞書検索メソッド
	public void search() {
			//for(String fruitsKey : fruit.keySet()) {
				if(fruit.containsKey(word)) {
					System.out.println(this.word + "の意味は" +fruit.get(word));
				} else {
					System.out.println(this.word + "は辞書に存在しません");
				
	}
			}
}

