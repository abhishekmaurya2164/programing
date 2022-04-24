package learning;


public class Demo3 {
	
	public static void main(String[] args) {
		String s="ABCDE";
		String resulString="";
		
		char[]ch= s.toCharArray();
		for (int i = ch.length-1; i >=0 ; i--) {
			resulString=resulString.concat(ch[i]+"");
		}
		System.out.println(resulString);
		
	}

}
