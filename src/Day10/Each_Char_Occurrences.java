package Day10;

import java.util.HashMap;
import java.util.Map;

public class Each_Char_Occurrences {

	public static void main(String[] args) {

		String str = "programming";
		Map<Character, Integer> charCountMap = new HashMap<>();

		for (char c : str.toCharArray()) {
			charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
		}

		System.out.println("Character count: " + charCountMap);

		// different approaches

		String rep = "vasanthkumarvasu";
		char ch[] = rep.toCharArray();
		Map<Character, Integer> mapp = new HashMap<Character, Integer>();
		for (char c : ch) {
			if (!mapp.containsKey(c)) {
				mapp.put(c, 1);
			}

			else {
				int count = mapp.get(c);
				mapp.put(c, count + 1);
			}

		}

		System.out.println(mapp);

	}
}
