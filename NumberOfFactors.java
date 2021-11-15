package November14;

import java.util.*;

public class NumberOfFactors {
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the Double Value:");
	
	int data = input.nextInt();
	
	int count_of_factors= 0;
	
	for(int i =0;i<=data; i+=1) {
		
		if(data%i==0) {
				count_of_factors+= 1;
				
				
				
		}
	}
		System.out.print(count_of_factors);

}
