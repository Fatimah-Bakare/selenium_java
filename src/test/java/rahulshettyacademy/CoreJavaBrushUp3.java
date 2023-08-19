package rahulshettyacademy;

public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		
//		String s1 = "rahul shetty academy";
		String s5 = "hello";
		
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
		String s = "rahul shetty academy";
		String[] splittedString = s.split("shetty");
		
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
		
		for(int i=0; i<s.length(); i++) 
		{
			System.out.println(s.charAt(i));
		}
		
		//Looping backwards
		for(int i=s.length()-1; i>=0; i--) 
		{
			System.out.println(s.charAt(i));
		}

	}

}
