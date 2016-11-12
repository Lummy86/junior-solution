package parsentev;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO: comment
 * @author parsentev
 * @since 31.03.2016
 */
public class ListRefenrenceVisibility {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("1");
		changeInnerState(list);
		changeReference(list);
		System.out.println(list);
	}

	private static void changeInnerState(List<String> list) {
		list.add("3");
	}

	private static void changeReference(List<String> list) {
		list = new ArrayList<String>();
		list.add("2");
	}
}
