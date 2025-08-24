package learn.automation;

class Mobile{
	
	String company;
	int price;
	static String device;
	
	public  void show() {
		System.out.println(company+ ":" + price +" :" + Mobile.device);
	}
	
	
	public  static void show1(Mobile obj) {
		System.out.println(obj.company+ ":" + obj.price +" :" + Mobile.device);
	}
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile obj1= new Mobile();
		
		obj1.company="Apple";
		obj1.price=200;
		Mobile.device="Phone";
		
		Mobile obj2= new Mobile();
		
		obj2.company="Samsung";
		obj2.price=300;
		
		
		
//		obj1.show();
//		obj2.show();
//		
		
		Mobile.show1(obj1);
		

	}

}
