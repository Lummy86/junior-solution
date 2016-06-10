package parsentev;

/**
 * TODO: comment
 * @author parsentev
 * @since 25.04.2016
 */
public class Substr {

	public static void main(String[] args) {
		System.out.println(new Substr().contain(" ", " "));
	}

	public boolean contain(String origin, String substr){
		char[] out = origin.toCharArray();
		char[] sub = substr.toCharArray();
		boolean result = true;
		for(int i=0;i!=out.length;i++) {
			result = true;
			for(int j=0;j!=sub.length;j++) {
				if (out[i+j] != sub[j]) {
					result = false;
					break;
				}
			}
			if (result) {
				break;
			}
		}
		return result;

	}

}
