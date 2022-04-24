package learning;

import java.util.HashSet;
import java.util.Set;

public class Triplate {
	
	public static void main(String[] args) {
		
		int[]arr= {-1,2,0,-2,3,1,-1,-3};
		int n=arr.length;
		boolean found=false;
		for(int i=0;i<n-1;i++) {
			Set s=new HashSet();
			for(int j=i+1;j<n;j++) {
				int x=-(arr[i]+arr[j]);
				if(s.contains(x)) {
					System.out.println(x+" "+arr[i]+" "+arr[j]);
					found=true;
					
				}
				else {
					s.add(arr[j]);
					
				}
			}
		}
		if(found==false) {
			System.out.println("notfound");
		}
	}

}
