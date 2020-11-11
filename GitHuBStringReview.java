package Day21_StringReview;

public class ReverseInterveiw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int input = 1234;
		
		int reverseNum = 0;
		
//		System.out.println(intput % 10);
	
		System.out.println(input);
		
		while (input != 0) {
			int remainder = input % 10;
			
			reverseNum = reverseNum*10 +remainder;
//			System.out.println(reverseNum);
			input = input / 10;
		}
		System.out.println(reverseNum);
		 
		 
		 
		
	}

}