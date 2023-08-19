package rahulshettyacademy;

public class ConstructorDemo {
	
	//Constructor will not return any values
	//name of constructor will be the class name 
	
	
	//Default constructor
	public ConstructorDemo() 
	{
		System.out.println("I am in the constructor");
		System.out.println("I am in the constructor lecture 1");
	}
	
	public ConstructorDemo(int a, int b) 
	{
		System.out.println("I am the Parameterized constructor");
		int c = a+b;
		System.out.println(c);
	}
	
	public ConstructorDemo(String str) 
	{
		System.out.println(str);
	}
	
	public void getData() 
	{
		System.out.println("I am the method");
	}

	public static void main(String[] args) {
		
		//constructor is a block of code whenever an object is created.
		
		//Whenever you create an object, constructor is called.
		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo c = new ConstructorDemo(3,6);
		ConstructorDemo cs = new ConstructorDemo("Hello");

	}

}
