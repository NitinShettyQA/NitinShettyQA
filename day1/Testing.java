package day1;


class Mobile
{
	int number;
	String name;
	static String brand;
	
	static
	{
		brand = "apple";
		System.out.println("inside static");
	}
	
	Mobile()
	{
		number = 100;
		name= "iphone";
		//brand = "apple";
		
	}
	
	public void display()
	{
		System.out.println("inside display");
	}
}
public class Testing {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("Mobile");
		/*
		 * Mobile obj1 = new Mobile(); obj1.display(); Mobile obj2 = new Mobile();
		 * obj1.display();
		 */
		
	}

}
