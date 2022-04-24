package learning;

public class AA {
	
	
	public static void main(String[] args) {
		String s="aaple";
		
		char[] a= s.toCharArray();
		
		
		for (int j = 0; j < a.length; j++) {
			int res=0;
		for (int i = j+1; i < a.length; i++) {
			
			if(a[j]==a[i]) {
				res++;
				break;
			}
			System.out.println(res+"  j ->"+ a[j]+"   i ->"+a[i]);
			
		}
		if(res==0) {
			System.out.println(a[j]+" is not repering");
			break;
			
		}
		
		}
		
	}
	
	
	
	
	

}
