package week1.day2;

public class PrimeNumber {
	
	
		public static void main(String[] args) {
			int i,j=0;
			 int x=3; 
			 
			 boolean flag=false;
			 
			  j=x/2; 
			  
			  if(x==0||x==1){  
				  
			   System.out.println(x+" is not a prime number");    
			   
			  }else{  
				  
			   for(i=2;i<=j;i++){ 
				   
			    if(x%i==0){    
			    	
			     System.out.println(x+" is not a prime number");      
			     flag=true;      
			     break;      
			    }      
			   }      
			   if(flag==false)  { 
				   
				   System.out.println(x+ " is a prime number"); 
				   }  
			  } 
			
		}
}

	
	   