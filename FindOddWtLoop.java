package learning;

public class FindOddWtLoop {

	public static void main(String[] args) {

		int c= getCount(3, 8);
		
		System.out.println(c);

	}

	private static int getCount(int i, int j) {

		int c = 0;

		if (i % 2 == 1 || j%2==1) {
			c = (((j - i) / 2) +1);

		} else {
			c = (j - i) / 2;
		}
		
//		c= ((j-i)/2)+1 -(i/2);

		return c;

	}

}
