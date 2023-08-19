package rahulshettyacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,4,6,8,9,10,20,122};
		
		for (int i = 0; i<arr.length; i++) 
		{
			if(arr[i] % 2 == 0) 
			{
				System.out.println(arr[i]);
				break;
			}
			else 
			{
				System.out.println(arr[i] + " is not a multiple of 2");
			}
		}
		
		ArrayList a = new ArrayList();
		//create object of class - object.method
		
		ArrayList<String> myString = new ArrayList<String>();
		myString.add("rahul");
		myString.add("shetty");
		myString.add("selenium");
		myString.add("academy");
		
		System.out.println(myString);
		System.out.println(myString.get(2));
		
		for(int i = 0; i<myString.size(); i++) 
		{
			System.out.println(myString.get(i));
		}
		
		System.out.println("***********");
		
		//Method 2 -- Advanced for loop
		for(String value: myString) 
		{
			System.out.println(value);
		}
		
		//Check the item in ArrayList
		System.out.println(myString.contains("selenium"));
		
		
		String[] name = {"rahul", "shetty", "selenium", "academy"};
		List<String> nameArrayList = Arrays.asList(name);
		System.out.println(nameArrayList);
		System.out.println(nameArrayList.contains("selenium"));

	}

}
