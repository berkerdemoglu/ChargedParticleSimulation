package electricity;

import java.awt.geom.Point2D;

public class Utils {

	public static double calcDistance(Particle p1, Particle p2) {
		return Point2D.distance(p1.getX(), p1.getY(), p2.getX(), p2.getY());
	}
}
