package week1.day2;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		int[] array={2, 5, 7, 7, 5, 9, 2, 3};
		
		Arrays.sort(array);
		//2 2 3 5 5 7 7 9
		
		
		for (int i = 0; i <array.length-1; i++) {
			if(array[i]==array[i+1]) {
            System.out.println(array[i]);
        }
	}


	}
}
