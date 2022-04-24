package learning;

import java.util.Arrays;
import java.util.Collections;

public class Arrayremove {
	
	 public static int removeDuplicates(int array[], int n){
	        int j = 0;
	        for (int i=0; i<n-1; i++){
	            if (array[i] != array[i+1]){
	                array[j++] = array[i];
	            }
	         }
	        array[j++] = array[n-1];
	        return j;
	    }
	    public static void main (String[] args) {
	        int array[] = {1, 2, 3, 4, 5, 1, 2};
	     
	        int length = array.length;
	        for (int i=0; i<length; i++)
	           System.out.print(array[i]+" ");
	        Arrays.sort(array);
	        System.out.println("------------");
	        length = removeDuplicates(array, length);
	        for (int i=0; i<length; i++)
	           System.out.print(array[i]+" ");
	    }
}
