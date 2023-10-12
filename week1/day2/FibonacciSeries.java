package week1.day2;

public class FibonacciSeries {

		public static void main(String[] args) {
			
			int range=8, firstNum=0, secondNum=1;
		
		
		System.out.println("FibonacciSeries till  "+ range +" teams:");
		
		for(int i = 1; i <= range; i++) {
			System.out.println( firstNum +" ");
			
			int sum =firstNum + secondNum;
			
			firstNum = secondNum;
			
			secondNum=sum;
			
	
	
	}

}
}