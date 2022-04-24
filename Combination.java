package learning;

public class Combination {
	public static void temp(String aa, String b)
    {
        // base case
        if (b == null) {
            return;
        }
 
        if (b.length() == 0) {
            System.out.println(aa);
        }
 
        for (int i = 0; i < b.length(); i++)
        {
            String n = aa + b.charAt(i);
 
            String r = b.substring(0, i) +
                    b.substring(i + 1);
 
            temp(n, r);
        }
    }
 
    // Find Permutations of a string in Java
    public static void main(String[] args)
    {
        String str = "abc";
        temp("", str);
    }

}
