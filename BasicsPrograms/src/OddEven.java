import java.lang.reflect.Array;
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
	
		// Display odd and even numbers from 1 to 1000
			
		System.out.println("Odd numbers");
		for(int i =0; i <=1000; i++) {
			if (i %2 == 1)
				System.out.println(i);
		}
		
		System.out.println("Even numbers");
		for(int i =0; i <=1000; i++) {
			if (i %2 == 0)
				System.out.println(i);
		}
	}
}
