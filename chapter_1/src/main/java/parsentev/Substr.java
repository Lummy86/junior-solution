package parsentev;

/**
 * TODO: comment
 * @author parsentev
 * @since 25.04.2016
 */
public class Substr {

	public static void main(String[] args) {
		System.out.println(new Substr().contain("aa aaa", "a a"));
	}

	public boolean contain(String origin, String substr){
		char[] originArray = origin.toCharArray();
		char[] substrArray = substr.toCharArray();
		int sizeValue = 0;
		int indexS = 0;
		for(int indexO = 0; indexO != originArray.length; indexO++){
			if (originArray[indexO] != substrArray[indexS]){
				indexS = 0;
				sizeValue = 0;
			} else{
				indexS++;
				sizeValue++;
			}
			if (sizeValue == substrArray.length){
				break;
			}
		}
		return sizeValue == substrArray.length;

	}

}
