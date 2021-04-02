package electricity;

public class Utils {

	public static double calcDistance(Particle p1, Particle p2) {
		double x1 = p1.getX();
		double y1= p1.getY();
		x1 -= p2.getX();
		y1 -= p2.getY();
		return Math.sqrt(x1 * x1 + y1 * y1);
	}
}
