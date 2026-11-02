package character_frequency;

import java.util.LinkedHashMap;
import java.util.Map;

public class MostRepeatedCharacters {
	static int max=0;
	static char word='\0';
	public static void main(String[] args) {
		String str = "methodoverloadign";

		char[] s = str.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(char word:s) {
			map.put(word,map.getOrDefault(word, 0)+1 );
		}
		map.forEach((key,value)->{
			if(value>max) {
				max=value;
				word=key;
			}	
		});
		System.out.println(word);
	}

}
