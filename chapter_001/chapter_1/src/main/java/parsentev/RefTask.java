package parsentev;


/**
 * TODO: comment
 * @author parsentev
 * @since 30.03.2016
 */
public class RefTask {
	public static void main(String[] args) {
		Integer value = 1;
		RefTask.change(value);
		System.out.println(value);
		++value;
		System.out.println(value);
	}

	public static void change(Integer value) {
		++value;
	}
}
