package parsentev;

/**
 * TODO: comment
 * @author parsentev
 * @since 04.04.2016
 */
public class ChangeState {
	public static class Claim {
		public String name;
	}

	public static void main(String[] args) {
		Claim claim = new Claim();
		claim.name = "bug";
		processClaim(claim);
		System.out.println(claim.name);
	}

	private static void processClaim(Claim value) {
		value.name = "task";
	}
}
