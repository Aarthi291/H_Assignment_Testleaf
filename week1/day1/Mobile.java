package week1.day1;

public class Mobile {
	public void makeCall() {
		String mobileModel = "Redmi 5g Note Pro";
		float mobileWeight = 2.1f;
		System.out.println("Mobile Model :" +  mobileModel );
		System.out.println("Mobile Weight :" + mobileWeight);
	}
	public void sendMsg() {
	
		boolean isFullCharged = true;
		int mobileCost = 15000;
		System.out.println("It's Fully chargeable :" + isFullCharged);
		System.out.println("Mobile Price :" + mobileCost);
	}
	public static void main(String[] args) {
		
		Mobile mob = new Mobile();
		
		mob.makeCall();
		mob.sendMsg();
		
		System.out.println("This is My Mobile");

	}

}
