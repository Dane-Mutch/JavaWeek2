package src;

import java.util.Arrays;

public class HackerRank {
	
	static boolean isAnagram(String a, String b) {
		String wordBuilder = "";
		if (a.length() != b.length()) {
			return false;
		} else { 
			char aAsArray[] = a.toCharArray();
			char bAsArray[] = b.toCharArray();
			Arrays.sort(bAsArray);
			Arrays.sort(bAsArray);
			for (int i = 0; i<a.length(); i++) {
				if (aAsArray[i]==(bAsArray[i])) {
					wordBuilder = wordBuilder + aAsArray[i];
				}
			}
		}
		if (wordBuilder.equals(a)) {
			return true;
		} else {
			return false;
		}
	}
}
			
				

	


