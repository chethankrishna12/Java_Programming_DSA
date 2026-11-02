package character_frequency;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicateCharacters {
	public static void main(String[] args) {
		String str = "methodoverloading";
		char[] s = str.toCharArray();

		Map<Character, Integer> map = new LinkedHashMap<>();
		for (char word : s) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}
		map.forEach((key, value) -> {
			
				System.out.println(key);
			
		});
	}

}
