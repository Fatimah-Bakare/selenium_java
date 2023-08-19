package rahulshettyacademy;

public class MethodsDemo {

	public static void main(String[] args) {
		
		MethodsDemo d = new MethodsDemo();
		String name = d.getData();
		System.out.println(name);
		
		MethodDemo2 d1 = new MethodDemo2();
		d1.getUserData();
		getData2();

	}
	
	public String getData() 
	{
		System.out.println("Hello World");
		return "Rahul Shetty";
	}
	
	public static String getData2() 
	{
		System.out.println("Hello World");
		return "Rahul Shetty";
	}

}
