package learning;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringOcc {
	
	public static void main(String[] args) {
		String s= "sjdndksa";
		Map< Character, Integer>map= new HashMap<Character, Integer>();
		
		
		char[]c= s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if(!map.containsKey(c[i])) {
				map.put(c[i], 1);
			}
			else {
				map.put(c[i], map.get(c[i])+1);
				
			}
			
		}
		
		for (Entry<Character, Integer> m :map.entrySet()) {
			System.out.println(m);
		}
	}

}
