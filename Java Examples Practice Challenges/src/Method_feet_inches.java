
public class Method_feet_inches {

	public static void main(String[] args) {
		calcFeet_to_Inches_to_Centimeters(-1,-7);

	}
	
	public static double calcFeet_to_Inches_to_Centimeters(double feet, double inches) {
		if((feet<0) || ((inches<0) || (inches>12))) {
			System.out.println("Invalid Feet or Inches...Run the program with proper value");
			return -1;
		}
		double centimeters = (feet*12)*2.54;
		centimeters += inches *2.54;
		System.out.println(feet+" feet "+inches+" Inches is "+centimeters+" cm ");
		return centimeters;
	}

}
