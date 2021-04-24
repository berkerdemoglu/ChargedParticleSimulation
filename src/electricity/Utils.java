package electricity;

public final class Utils {

	private Utils() {
		throw new IllegalStateException("Cannot instantiate Utils Class");
	}

	public static double calcDistance(final Particle p1, final Particle p2) {
		double x1 = p1.getX();
		double y1= p1.getY();
		x1 -= p2.getX();
		y1 -= p2.getY();
		return Math.sqrt(x1 * x1 + y1 * y1);
	}
}