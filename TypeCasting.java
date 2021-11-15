
public class TypeCasting {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// AUtomatic/Widening TypeCasting
		short salary = 3000;
		int annual_salary = salary *12;
		
		int pincode = 226016;
		long pin_code = pincode  ;
		
		System.out.println(annual_salary);
		System.out.println(pin_code);
		
		// manual/narrowing/Explicit Typecasting
		
		short date = 13;
		byte  new_date = (byte) date;
		System.out.println(new_date);
		
		
		float precentage= 91.99f ;

		int new_percent= (int) percentage;
		System.out.println(new_percent);
		
		
	}

}
