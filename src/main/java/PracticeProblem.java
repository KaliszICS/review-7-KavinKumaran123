
public class PracticeProblem {
	public static void main(String args[]) {

		}
	public static String evenOrOdd(int num){
		if (num % 2 == 0){
			return "Even";	
		}
		else{
			return "Odd";
		}
	}
	public static String teacherOrStudent(String name){
		if (name.equals("Kalisz")){
			return "Teacher";
		}
		else{
			return "Student";
		}

	} 
	public static int fartherFromZero(int a){
		if (a <0){
			return a-5;
		}
		else if (a>0){
			return a+5;
		
		}
		else{
			return 0;
		}
	}
	public static String isFive(int num){
		if (num ==5){
			return "The number is Five";
		}
		else{
			return "The number is not Five";
		}
	}
	public static String positiveOrNegative(double a){
		if (a> 0){
			return "Positive";
		}
		else{
			return "Negative";
		}

	}
	public static String highOrLow(int a){
		if (a>100){
			return "High";
		
		}
		else{
			return "Low";
		}
	}
	public static String isHello(String a){
		if (a.equals("Hello")){
			return "The word is Hello";

		}
		else{
			return "The word is not Hello";
		}
	}
}
	
	



	


