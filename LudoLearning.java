package learning;

import java.util.HashMap;
import java.util.Map;

public class LudoLearning {
	
	public static void main(String[] args) {
		Map<Integer,Integer> map= new HashMap<Integer,Integer>();
		map.put(36, 15);
		map.put(25,12);
		map.put(57, 30);
		map.put(70, 45);
		map.put(99, 73);
		
		int count=0,i=0;
		
		while(true) {
			i++;
//			System.out.print(count);
			if(count>=100) {
				break;
			}else {
				
				int r=(int) (Math.random()*6+1);
				if((count+r)<=100) 
				count=count+r;
				if(map.containsKey(count)) {
					count=count-map.get(count);
				}
				
				System.out.print(r+" "+count+" ");
			}
			
		}
		System.out.println(i);
		System.out.println(i);
		
		
	}

}
