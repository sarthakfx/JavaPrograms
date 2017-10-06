package com.sarthak.java;
import java.util.HashMap;

public class LetterCount {

	public static void main(String[] args) {
		String str = "Game of Thrones is an American fantasy drama television series created by David Benioff and D. B. Weiss. It is an adaptation of A Song of Ice and Fire, George R. R. Martin's series of fantasy novels, the first of which is A Game of Thrones. It is filmed in Belfast and elsewhere in the United Kingdom, Canada, Croatia, Iceland, Malta, Morocco, Spain, and the United States. The series premiered on HBO in the United States on April 17, 2011, and its sixth season ended on June 26, 2016. The series was renewed for a seventh season,[1] which premiered on July 16, 2017,[2] and will conclude with its eighth season in 2018 or 2019";
		HashMap<Character, Integer> map = new HashMap<>();
		for (char ch : str.toCharArray()) {
			if (map.containsKey(ch)) {
				int val = map.get(ch);
				map.put(ch, val + 1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);

	}

}
