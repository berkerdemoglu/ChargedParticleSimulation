package physics.electricity;

public class Particle {
	// Define physical constants.
	public static final double K = 9 * Math.pow(10, 9);

	// Physical properties of the particle.
	private double charge; // in coulombs

	// X and Y coordinates of the particle
	private int x;
	private int y;

	public Particle(double charge, int x, int y) {
		setCharge(charge);
		setX(x);
		setY(y);
	}

	public Particle(int x, int y) {
		// +1C at (x,y)
		this(1.0, x, y);
	}

	public Particle() {
		// +1C at (0, 0)
		this(0 , 0);
	}

	public String toString() {
		StringBuilder repr = new StringBuilder("(charge:");
		repr.append(charge).append(", x:").append(x).append(", y:").append(y).append(")");

		return repr.toString();
	}

	public double getCharge() {
		return charge;
	}

	public void setCharge(double charge) {
		this.charge = charge;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
