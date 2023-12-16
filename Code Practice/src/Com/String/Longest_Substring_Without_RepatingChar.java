/*
Input  ::  ABCABCAA 
Output ::  ABC Length is 3
Input :: JAVA
Output :: JAV Length is 3



*/
package Com.String;

import java.util.LinkedHashMap;
import java.util.Map;

public class Longest_Substring_Without_RepatingChar {

	public static void main(String[] args) {
		LengthOfLongestSubString("abcdeabcd");
	}
	
	 public static void LengthOfLongestSubString(String s) {
		String LongestSubString=null;
		int LongestSubStringLength=0;
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char[] arr = s.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			if(!map.containsKey(ch)){
				map.put(ch,i);
			}else {
				i=map.get(ch);
				map.clear();
			}
			if (map.size()>LongestSubStringLength) {
				LongestSubStringLength=map.size();
				LongestSubString =map.keySet().toString();
			}
		}
		
		
		System.out.println("Longest SubString is :: "+LongestSubString);
		System.out.println("Longest SubStringLength is :: "+LongestSubStringLength);
	}
	
}
