package physics;

import physics.electricity.Particle;

public abstract class Utils {

	public static double calcDistance(Particle p1, Particle p2) {
		double x1 = p1.getX();
		double y1= p1.getY();
		x1 -= p2.getX();
		y1 -= p2.getY();
		return Math.sqrt(x1 * x1 + y1 * y1);
	}

	public static double calcDistance(double x1, double y1, double x2, double y2) {
		x1 -= x2;
		y1 -= y2;
		return Math.sqrt(x1 * x1 + y1 * y1);
	}
}
