package learning;

public class Demo2 {
	
	/*
	 * rotateArray(int n){} 1,2,3,4,5,6 n = 1 -> 6,1,2,3,4,5 n = 2 -> 5,6,1,2,3,4
	 */
	
	public static void main(String[] args) {
		
		rotateArray(5);
		
//		int[] input= {1,2,3,4,5,6};
		
		
		
		
	}
	
	public static void rotateArray(int n){
		
		int[] input= {1,2,3,4,5,6};
		
	for (int i=input.length-n;i<input.length;i++) {
		
		System.out.print(input[i]);
		
	}
	for (int i=0;i<input.length-n;i++) {
		
		System.out.print(input[i]);
		
	}
		
	}

}
