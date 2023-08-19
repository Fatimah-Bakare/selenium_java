package rahulshettyacademy;

public class NestedLoops {

	public static void main(String[] args) {
		
		//How nested loops works--
		for(int i=1; i<=4; i++) //(Outer for loop) this block will loop for 4 times
		{
			System.out.println("Outer loop started");
			for(int j=1; j<=4; j++) 
			{
				System.out.println("Inner loop");
			}
			System.out.println("Outer loop finished");
		}
		
		int k = 1;
		for(int i=0; i<4; i++) //(Outer for loop) this block will loop for 4 times
		{
			//System.out.println("Outer loop started");
			for(int j=1; j<=j-i; j++) 
			{
				System.out.print( k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}
		
		int m = 1;
		for(int i=0; i<5; i++) //(Outer for loop) this block will loop for 4 times
		{
			//System.out.println("Outer loop started");
			for(int j=1; j<=i; j++) 
			{
				System.out.print( m);
				System.out.print("\t");
				m++;
			}
			System.out.println("");
		}
		
		//int n = 1;
		for(int i=0; i<5; i++) //(Outer for loop) this block will loop for 4 times
		{
			//System.out.println("Outer loop started");
			for(int j=1; j<=i; j++) 
			{
				System.out.print(j);
				System.out.print("\t");
				//n++;
			}
			System.out.println("");
		}

	}

}
