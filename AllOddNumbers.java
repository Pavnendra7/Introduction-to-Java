package November14;

import java.util.*;


public class AllOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Integer Number:");
		int number = input.nextInt();
		
		for( int i =1; i<=100; i++) {
			
			if((i%2)!=0) {
				System.out.println(i);
				
			}
			
			else {
				System.out.println("Number is Even");
				
			}
			
		}
		

	}

}
