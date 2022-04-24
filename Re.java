package learning;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Re {
	
	public static void main(String[] args) {
		String s= "asdasdasd"; 
		
		char[] ch= s.toCharArray();
		
		Map<Character, Integer> map= new HashMap<Character, Integer>();
		Map<Character, Integer> ma= new HashMap<Character, Integer>();
		
		for (char c : ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
				
			}
			else {
				map.put(c,1);
			}
			
		}
		
		for (Entry<Character, Integer>m : map.entrySet()) {
			
			System.out.println(m.getKey() +"   "+m.getValue());
			
		}
		
		
		
		
		
		
		
 		
	}

	
	
	
}
