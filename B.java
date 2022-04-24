package learning;
public class B {
	
	public void show() {
		System.out.println("Class B");
	}
	
	public static void main(String[] args) {
		B a= new B();
		
		a.show();
	}
	
//	public static void main(String[] args) {
//		int a[][]= {{1,1,2,2},{1,2,2,2},{1,2,3,4},{1,4,1,2}};
//		
//		int s=0;
//		int col= a[0].length-2;
//		for (int i = 0; i < 4; i++) {
//			s=s+a[i][col];
//			
//		}
//		
//		System.out.println(s);
//	}
	
}