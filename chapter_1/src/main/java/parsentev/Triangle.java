package parsentev;

/**
 * @author parsentev
 * @since 05.04.2016
 */
public class Triangle {
	public Point one;
	public Point two;
	public Point three;



	public Triangle(Point pointOne, Point pointTwo, Point pointThree) {

		one =  pointOne;
		two = pointTwo;
		three = pointThree;

		System.out.println("???????  ");

	}

	public boolean check() {


		if ( one.x == one.y && two.x == two.y && three.x ==three.y ||  one.x == two.x && two.x == three.x
		     ||  one.y == two.y && two.y == three.y  || one.x == 0 && one.y ==0 ||
		     two.x == 0 && two.y ==0  || three.x == 0 && three.y ==0 ) {




			System.out.println("Straight line! This is not triangle!  ");
			return  false;
		} else
			return  true;
	}

	public static void main(String[] arg) {
		Triangle triangle = new Triangle(new Point(0, 0), new Point(1, 1), new Point(2, 2));
		System.out.println(triangle.check());
	}
}
