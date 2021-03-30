package electricity;

public class Utils {

	public static double calcDistance(Particle p1, Particle p2) {
		return Math.sqrt((p2.getX() - p1.getX()) + (p2.getX() - p1.getX()));
	}

	public static double factorial(double n) {
		if (n <= 1) {
			return n;
		} else {
			return n * factorial(n - 1);
		}
	}

	public static double combination(double n, double r) {
		return factorial(n) / (factorial(n - r) * factorial(r));
	}
}
