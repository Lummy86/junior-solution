package parsentev;

/**
 * TODO: comment
 * @author parsentev
 * @since 12.04.2016
 */
import java.math.*;

public class CubeFunction {

	int a;
	int b;
	int c;

	public CubeFunction(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public float calculate(int x) {
		return -1;
	}

	public void showMessage(Object message) {
		System.out.println(message);
	}

	public static void main(String[] args) {
		int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[1]);
		int c = Integer.valueOf(args[2]);
		int x1 = Integer.valueOf(args[3]);
		int x2 = Integer.valueOf(args[4]);
		CubeFunction cubefunction = new CubeFunction(a, b, c);
		for(int x=x1;x!=x2;++x) {
			cubefunction.showMessage(cubefunction.calculate(x));
		}
	}
}
