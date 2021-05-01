package physics;

public class Vector {
	private double x;
	private double y;

	public Vector(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void scale(double s) {
		x = s * x;
		y = s * y;
	}

	public double getVectorLength() {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}

	public static Vector addVectors(Vector v1, Vector v2) {
		return new Vector(v1.getX() + v2.getX(), v1.getY() + v2.getY());
	}

	public static Vector subtractVectors(Vector v1, Vector v2) {
		return new Vector(v1.getX() - v2.getX(), v1.getY() - v2.getY());
	}

	public String toString() {
		return "<" + x + ", " + y + ">";
	}

	// Getters and Setters
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}
