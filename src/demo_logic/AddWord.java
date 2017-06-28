package demo_logic;

import java.util.TreeMap;

public class AddWord {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		String output = null;
		TreeMap<Character, Integer> hm = new TreeMap<Character, Integer>();
		hm.put('A', 1);
		hm.put('B', 2);
		hm.put('C', 3);
		hm.put('D', 4);
		hm.put('E', 5);
		hm.put('F', 6);
		hm.put('G', 7);
		hm.put('H', 8);
		hm.put('I', 9);
		hm.put('J', 10);
		hm.put('K', 11);
		hm.put('L', 12);
		hm.put('M', 13);
		hm.put('N', 14);
		hm.put('O', 15);
		hm.put('P', 16);
		hm.put('Q', 17);
		hm.put('R', 18);
		hm.put('S', 19);
		hm.put('T', 20);
		hm.put('U', 21);
		hm.put('V', 22);
		hm.put('W', 23);
		hm.put('X', 24);
		hm.put('Y', 25);
		hm.put('Z', 26);
		int len;
		String input = "java program".toUpperCase();
		String words[] = input.split(" ");
		char ch = 0;
		char ch1;
		char ch2;
		int len1;
		int sum = 0;
		int temp = 0;
		char c;
		for (int i = 0; i < words.length; i++) {
			len = words[i].length();
			if (len % 2 == 0) {
				len1 = len / 2;
			} else {
				ch = words[i].charAt(len / 2);
				sum += hm.get(ch);
				len1 = len / 2;
			}
			for (int j = 0; j < len1; j++) {
				ch1 = words[i].charAt(j);
				ch2 = words[i].charAt(len - 1 - j);
				temp = Math.abs(hm.get(ch1) - hm.get(ch2));
				sum += temp;
			}
			sb.append(sum);
			output = sb.toString();
			sum = 0;
		}
		System.out.println(output);
	}
}
