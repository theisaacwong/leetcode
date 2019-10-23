package leetcode;

import java.util.HashSet;

public class lengthOfLongestSubstring {
	
	public int LengthOfLongestSubstring(String s) {
		String currObv = "";
		int currBest = 0;
		for(int i = 0; i < s.length(); i++) {
			currObv = s.substring(0, i);
			HashSet<String> usedCharacters = new HashSet<String>();
			for(int k = 0; k < currObv.length(); k++) {
				usedCharacters.add(String.valueOf(currObv.charAt(k)));
			}
			if(usedCharacters.size() == currObv.length() && currObv.length() > currBest) {
				currBest = currObv.length();
			}
		}
		return currBest;
	}




}
