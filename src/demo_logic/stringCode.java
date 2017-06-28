package demo_logic;

import java.util.HashMap;

public class stringCode {

	public static void main(String[] args) {
		String str = "JAVA PROGRAMMING";
		char s1 = 0, s2 = 0, s3 = 0;
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("A", 1);
		hm.put("B", 2);
		hm.put("C", 3);
		hm.put("D", 4);
		hm.put("E", 5);
		hm.put("F", 6);
		hm.put("G", 7);
		hm.put("H", 8);
		hm.put("I", 9);
		hm.put("J", 10);
		hm.put("K", 11);
		hm.put("L", 12);
		hm.put("M", 13);
		hm.put("N", 14);
		hm.put("O", 15);
		hm.put("P", 16);
		hm.put("Q", 17);
		hm.put("R", 18);
		hm.put("S", 19);
		hm.put("T", 20);
		hm.put("U", 21);
		hm.put("V", 22);
		hm.put("W", 23);
		hm.put("X", 24);
		hm.put("Y", 25);
		hm.put("Z", 26);
		String[] word = str.split(" ");
		int value = 0;
		String output = "";
		for (int i = 0; i < word.length; i++) {
			for (int j = 0; j < word[i].length() / 2; j++) {
				s1 = word[i].charAt(j);
				s2 = word[i].charAt(word[i].length() - j - 1);
				int value1 = hm.get(Character.toString(s1));
				int value2 = hm.get(Character.toString(s2));
				if (value1 > value2)
					value += value1 - value2;
				else
					value += value2 - value1;
			}
			if (word[i].length() % 2 == 1) {

				s3 = word[i].charAt(word[i].length() / 2);
				int value3 = hm.get(Character.toString(s3));
				value += value3;
			}
			output += value;
			value = 0;

		}

		System.out.print(output);

	}

}
