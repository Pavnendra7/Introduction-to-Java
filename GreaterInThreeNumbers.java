package November14;

import java.util.*;

public class GreaterInThreeNumbers {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first Number:");
		int first = input.nextInt();
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter the Second Number:");
		int second= input1.nextInt();
		
		Scanner input3 = new Scanner(System.in);
		System.out.println("Enter the Third Number:");
		int third = input3.nextInt();
		
		if(first>second && first>third) {
			System.out.println("First Number is Greatest amongst all");
			
		}
		else if(second>third && second>first) {
			System.out.println("Second number is Greatest amongst all");
			
		}
		
		else {
			
		System.out.println("Third number is Greatest amongst all");
		}
		
		
	}

}
