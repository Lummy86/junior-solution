package rali;

public class Loops {

	public static void main(String[] args) {
		boolean expression = true;
		int count = 0;
		//while (expression) {
		//	System.out.println(count);
		//	count++; //count = count + 1;
		//	expression = count < 10;
		//}
		//System.out.println("finish loop while");
			
		
		/*do {
			System.out.println("Menu");
			expression = false;
		} while(expression);

		System.out.println("finish loop do while");
		*/
	
		for (int index=0;index<10;index++) {
			if (index == 5) {
				break;
			}
			System.out.println("for : " + index);

		}
		System.out.println("Finish for");
		

		/*for (String arg : args) {
			System.out.println(arg);
		}
		System.out.println("finish foreach");
		*/
	}
}