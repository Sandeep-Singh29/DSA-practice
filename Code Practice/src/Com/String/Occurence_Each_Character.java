/*
Input :: 	Hello
Output :: H-1 , E-1 , L-2 , O-1

Approach 
1st we have change string into char[]
2nd create the MAP for stored (Key,value):: key is char & Value is occurence
3rd put value in map and check whether char is contains or not
4ht get the value and count +1;
*/
package Com.String;

import java.util.LinkedHashMap;
import java.util.Map;

public class Occurence_Each_Character {

	public static void main(String[] args) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		String word= "SandeepSingh";
		System.out.println(word);
		char[] chArr = word.toCharArray();
		
		for (char ch : chArr) {
			if(!map.containsKey(ch)) {
			map.put(ch, 1);
			}else{
				int count = map.get(ch);
				map.put(ch, count+1);
			}
		}
		System.out.println(map);
	}
	
	
}
