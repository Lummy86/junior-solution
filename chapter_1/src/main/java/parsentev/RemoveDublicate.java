package parsentev;

import java.util.Arrays;

/**
 * TODO: comment
 * @author parsentev
 * @since 19.04.2016
 */
public class RemoveDublicate {

	public static void main(String[] args) {
		String[] arrays = {"1", "1", "2", "2", "3", "3"};
		for (int out=0;out!=arrays.length;out++) {
			for (int inner=out;inner!=arrays.length;inner++) {
				if (out != inner) {
					String value = arrays[out];
					if (value != null) {
//						if (arrays[out].equals(arrays[inner]) {
//							arrays[inner] = null;
//						}

					}
				}
			}
		}
		System.out.println(Arrays.toString(arrays));
	}
}
