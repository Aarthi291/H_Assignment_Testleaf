package week1.day2;

import java.util.Arrays;

public class SecondSmallestNumber {
	
		 public static void main(String args[]){
		      
		      int array[] = {23,45,67,32,89,22};
		    int n = array.length;

		     Arrays.sort(array);

		     System.out.println("Second Smallest Number element is : "+ array[1]);
}
}